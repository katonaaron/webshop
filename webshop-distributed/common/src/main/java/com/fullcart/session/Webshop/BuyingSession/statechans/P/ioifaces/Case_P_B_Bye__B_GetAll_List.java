package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;

public interface Case_P_B_Bye__B_GetAll_List<__Succ1 extends Succ_In_B_Bye, __Succ2 extends Succ_In_B_GetAll_List> extends In_B_Bye<__Succ1>, In_B_GetAll_List<__Succ2> {
	Branch_P_B_Bye__B_GetAll_List<?, ?> cast = null;

	Branch_P_B_Bye__B_GetAll_List.Branch_P_B_Bye__B_GetAll_List_Enum getOp();

	com.fullcart.session.Webshop.BuyingSession.statechans.P.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
