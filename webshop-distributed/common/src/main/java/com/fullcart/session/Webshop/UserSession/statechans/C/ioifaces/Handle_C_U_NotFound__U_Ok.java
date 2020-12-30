package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.ops.Ok;

public interface Handle_C_U_NotFound__U_Ok<__Succ1 extends Succ_In_U_NotFound, __Succ2 extends Succ_In_U_Ok> extends Callback_U_NotFound<__Succ1>, Callback_U_Ok<__Succ2> {

	void receive(__Succ1 schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
