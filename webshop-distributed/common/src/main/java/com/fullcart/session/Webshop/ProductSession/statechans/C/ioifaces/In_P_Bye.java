package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.P;

public interface In_P_Bye<__Succ extends Succ_In_P_Bye> {

	__Succ receive(P role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
