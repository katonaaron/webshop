package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.roles.P;

public interface In_P_NotFound<__Succ extends Succ_In_P_NotFound> {

	__Succ receive(P role, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
