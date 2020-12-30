package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_Bye<__Succ extends Succ_In_B_Bye> {

	__Succ receive(B role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
