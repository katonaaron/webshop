package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;

public interface Case_C_P_NotFound__P_Ok_Product<__Succ1 extends Succ_In_P_NotFound, __Succ2 extends Succ_In_P_Ok_Product> extends In_P_NotFound<__Succ1>, In_P_Ok_Product<__Succ2> {
	Branch_C_P_NotFound__P_Ok_Product<?, ?> cast = null;

	Branch_C_P_NotFound__P_Ok_Product.Branch_C_P_NotFound__P_Ok_Product_Enum getOp();

	__Succ1 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
