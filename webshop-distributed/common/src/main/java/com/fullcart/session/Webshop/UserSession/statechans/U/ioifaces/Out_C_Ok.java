package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.C;

import java.io.IOException;

public interface Out_C_Ok<__Succ extends Succ_Out_C_Ok> {

	__Succ send(C role, Ok op) throws org.scribble.main.ScribRuntimeException, IOException;
}
