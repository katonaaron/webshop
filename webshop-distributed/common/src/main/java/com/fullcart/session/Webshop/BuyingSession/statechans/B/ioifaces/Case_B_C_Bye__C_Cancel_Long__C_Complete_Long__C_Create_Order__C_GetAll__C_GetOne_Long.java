package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.*;

public interface Case_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Cancel_Long, __Succ3 extends Succ_In_C_Complete_Long, __Succ4 extends Succ_In_C_Create_Order, __Succ5 extends Succ_In_C_GetAll, __Succ6 extends Succ_In_C_GetOne_Long> extends In_C_Bye<__Succ1>, In_C_Cancel_Long<__Succ2>, In_C_Complete_Long<__Succ3>, In_C_Create_Order<__Succ4>, In_C_GetAll<__Succ5>, In_C_GetOne_Long<__Succ6> {
	Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<?, ?, ?, ?, ?, ?> cast = null;

	Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long.Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum getOp();

	__Succ1 receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Cancel op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(Complete op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ4 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ5 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ6 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
