package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.C;

public interface In_C_Bye<__Succ extends Succ_In_C_Bye> {

	__Succ receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
