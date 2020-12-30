package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;

public interface Case_B_U_NotFound__U_Ok_User<__Succ1 extends Succ_In_U_NotFound, __Succ2 extends Succ_In_U_Ok_User> extends In_U_NotFound<__Succ1>, In_U_Ok_User<__Succ2> {
	Branch_B_U_NotFound__U_Ok_User<?, ?> cast = null;

	Branch_B_U_NotFound__U_Ok_User.Branch_B_U_NotFound__U_Ok_User_Enum getOp();

	__Succ1 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
