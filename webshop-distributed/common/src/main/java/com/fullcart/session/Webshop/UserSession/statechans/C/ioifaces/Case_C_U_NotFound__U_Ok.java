package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.ops.Ok;

public interface Case_C_U_NotFound__U_Ok<__Succ1 extends Succ_In_U_NotFound, __Succ2 extends Succ_In_U_Ok> extends In_U_NotFound<__Succ1>, In_U_Ok<__Succ2> {
	Branch_C_U_NotFound__U_Ok<?, ?> cast = null;

	Branch_C_U_NotFound__U_Ok.Branch_C_U_NotFound__U_Ok_Enum getOp();

	__Succ1 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
