package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.roles.P;

import java.io.IOException;

public interface Out_P_Bye<__Succ extends Succ_Out_P_Bye> {

	__Succ send(P role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException;
}
