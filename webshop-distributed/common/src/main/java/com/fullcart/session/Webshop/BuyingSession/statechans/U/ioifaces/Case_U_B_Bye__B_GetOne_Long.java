package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetOne;

public interface Case_U_B_Bye__B_GetOne_Long<__Succ1 extends Succ_In_B_Bye, __Succ2 extends Succ_In_B_GetOne_Long> extends In_B_Bye<__Succ1>, In_B_GetOne_Long<__Succ2> {
	Branch_U_B_Bye__B_GetOne_Long<?, ?> cast = null;

	Branch_U_B_Bye__B_GetOne_Long.Branch_U_B_Bye__B_GetOne_Long_Enum getOp();

	com.fullcart.session.Webshop.BuyingSession.statechans.U.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
