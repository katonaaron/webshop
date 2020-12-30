package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.GetAll;
import com.fullcart.session.Webshop.ProductSession.roles.C;

public interface In_C_GetAll<__Succ extends Succ_In_C_GetAll> {

	__Succ receive(C role, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
