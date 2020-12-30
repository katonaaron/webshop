package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Bye;
import com.fullcart.session.Webshop.UserSession.roles.U;

import java.io.IOException;

public interface Out_U_Bye<__Succ extends Succ_Out_U_Bye> {

	__Succ send(U role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException;
}
