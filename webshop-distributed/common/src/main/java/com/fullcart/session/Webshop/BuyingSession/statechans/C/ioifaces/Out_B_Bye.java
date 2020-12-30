package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Bye<__Succ extends Succ_Out_B_Bye> {

	__Succ send(B role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException;
}
