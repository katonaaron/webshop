package com.fullcart.service

import com.fullcart.dto.DTO
import org.springframework.data.repository.CrudRepository

import scala.collection.mutable.ListBuffer
import scala.jdk.CollectionConverters.{IterableHasAsJava, IterableHasAsScala}
import scala.jdk.OptionConverters._

abstract class AbstractService[ID, D <: DTO[ID], M](
                                                     private val repository: CrudRepository[M, ID],
                                                     dtoTransformer: DtoTransformer[ID, D, M]
                                                   ) extends Service[ID, D] {

  override def findAll(): java.lang.Iterable[D] = repository
    .findAll()
    .asScala
    .map(dtoTransformer.toDto)
    .asJava

  override def findAllById(ids: java.lang.Iterable[ID]): Either[ID, java.lang.Iterable[D]] = {
    @annotation.tailrec
    def loop(ss: Seq[ID], acc: ListBuffer[D]): Either[ID, java.lang.Iterable[D]] =
      ss match {
        case Nil => Right(acc.asJava)
        case id :: xs =>
          findById(id)
          match {
            case None => Left(id)
            case Some(dto) => loop(xs, acc :+ dto)
          }
      }

    loop(ids.asScala.toSeq, ListBuffer())
  }

  override def findById(id: ID): Option[D] = repository
    .findById(id)
    .toScala
    .map(dtoTransformer.toDto)

  override def create(dto: D): Either[String, D] = {
    (for {
      product <- dtoTransformer.fromDto(dto)
      // TODO: Further validation
    } yield product)
    match {
      case Left(error) => Left(error)
      case Right(product) =>
        Right(dtoTransformer.toDto(repository.save(product)))
    }
  }

  override def update(id: ID, dto: D): Option[Either[String, D]] = {
    repository
      .findById(id)
      .toScala
      .map { oldProduct =>
        (for {
          product <- Right(dtoTransformer.update(oldProduct, dto))
          // TODO: Further validation
        } yield product)
          .map(repository.save)
          .map(dtoTransformer.toDto)
      }
  }

  override def replace(id: ID, dto: D): Either[String, D] = {
    (for {
      product <- dtoTransformer.fromDto(id, dto)
      // TODO: Further validation
    } yield product)
      .map(repository.save)
      .map(dtoTransformer.toDto)
  }

  override def deleteById(id: ID): Boolean =
    if (repository.existsById(id)) {
      repository.deleteById(id)
      true
    } else {
      false
    }
}
