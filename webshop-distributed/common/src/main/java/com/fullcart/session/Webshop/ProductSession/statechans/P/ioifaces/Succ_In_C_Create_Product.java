package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

public interface Succ_In_C_Create_Product {

	default Select_P_C_One_Product<?> to(Select_P_C_One_Product<?> cast) {
		return (Select_P_C_One_Product<?>) this;
	}
}