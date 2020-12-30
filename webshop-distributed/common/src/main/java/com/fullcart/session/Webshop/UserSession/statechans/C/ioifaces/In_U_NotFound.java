package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.roles.U;

public interface In_U_NotFound<__Succ extends Succ_In_U_NotFound> {

	__Succ receive(U role, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
