package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Created;
import com.fullcart.session.Webshop.ProductSession.ops.Err;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;

public interface Case_C_P_Created_Product__P_Err_String__P_Ok_Product<__Succ1 extends Succ_In_P_Created_Product, __Succ2 extends Succ_In_P_Err_String, __Succ3 extends Succ_In_P_Ok_Product> extends In_P_Created_Product<__Succ1>, In_P_Err_String<__Succ2>, In_P_Ok_Product<__Succ3> {
	Branch_C_P_Created_Product__P_Err_String__P_Ok_Product<?, ?, ?> cast = null;

	Branch_C_P_Created_Product__P_Err_String__P_Ok_Product.Branch_C_P_Created_Product__P_Err_String__P_Ok_Product_Enum getOp();

	__Succ1 receive(Created op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Err op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
