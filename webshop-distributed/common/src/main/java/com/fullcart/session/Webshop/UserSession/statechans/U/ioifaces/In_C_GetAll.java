package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.GetAll;
import com.fullcart.session.Webshop.UserSession.roles.C;

public interface In_C_GetAll<__Succ extends Succ_In_C_GetAll> {

	__Succ receive(C role, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
