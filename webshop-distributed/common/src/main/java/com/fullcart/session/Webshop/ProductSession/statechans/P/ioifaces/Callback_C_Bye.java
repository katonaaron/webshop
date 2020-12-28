package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;

public interface Callback_C_Bye<__Succ extends Succ_In_C_Bye> {

	void receive(__Succ schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
