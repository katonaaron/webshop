package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Err;
import com.fullcart.session.Webshop.UserSession.ops.Ok;

public interface Case_C_U_Err_String__U_Ok_User<__Succ1 extends Succ_In_U_Err_String, __Succ2 extends Succ_In_U_Ok_User> extends In_U_Err_String<__Succ1>, In_U_Ok_User<__Succ2> {
	Branch_C_U_Err_String__U_Ok_User<?, ?> cast = null;

	Branch_C_U_Err_String__U_Ok_User.Branch_C_U_Err_String__U_Ok_User_Enum getOp();

	__Succ1 receive(Err op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
