package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Ok;

public interface Callback_U_Ok<__Succ extends Succ_In_U_Ok> {

	void receive(__Succ schan, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
