package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Bye;

public interface Callback_C_Bye<__Succ extends Succ_In_C_Bye> {

	void receive(__Succ schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
