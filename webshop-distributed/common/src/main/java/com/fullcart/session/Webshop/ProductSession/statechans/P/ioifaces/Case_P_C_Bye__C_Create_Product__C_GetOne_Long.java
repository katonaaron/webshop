package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.ops.GetOne;

public interface Case_P_C_Bye__C_Create_Product__C_GetOne_Long<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_Product, __Succ3 extends Succ_In_C_GetOne_Long> extends In_C_Bye<__Succ1>, In_C_Create_Product<__Succ2>, In_C_GetOne_Long<__Succ3> {
	Branch_P_C_Bye__C_Create_Product__C_GetOne_Long<?, ?, ?> cast = null;

	Branch_P_C_Bye__C_Create_Product__C_GetOne_Long.Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum getOp();

	__Succ1 receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
