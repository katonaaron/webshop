package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.P;

public interface In_P_Ok<__Succ extends Succ_In_P_Ok> {

	__Succ receive(P role, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
