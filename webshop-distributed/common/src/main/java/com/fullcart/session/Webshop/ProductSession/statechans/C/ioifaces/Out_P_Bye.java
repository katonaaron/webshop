package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.P;

import java.io.IOException;

public interface Out_P_Bye<__Succ extends Succ_Out_P_Bye> {

	__Succ send(P role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException;
}
