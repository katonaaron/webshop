package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;

public interface Callback_B_Bye<__Succ extends Succ_In_B_Bye> {

	void receive(__Succ schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
