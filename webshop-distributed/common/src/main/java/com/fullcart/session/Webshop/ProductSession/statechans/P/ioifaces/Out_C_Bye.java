package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.C;

import java.io.IOException;

public interface Out_C_Bye<__Succ extends Succ_Out_C_Bye> {

	__Succ send(C role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException;
}
