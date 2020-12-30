package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.GetAll;
import com.fullcart.session.Webshop.UserSession.roles.U;

import java.io.IOException;

public interface Out_U_GetAll<__Succ extends Succ_Out_U_GetAll> {

	__Succ send(U role, GetAll op) throws org.scribble.main.ScribRuntimeException, IOException;
}
