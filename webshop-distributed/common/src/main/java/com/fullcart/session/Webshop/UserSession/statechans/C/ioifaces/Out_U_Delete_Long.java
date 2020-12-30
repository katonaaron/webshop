package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Delete;
import com.fullcart.session.Webshop.UserSession.roles.U;

import java.io.IOException;

public interface Out_U_Delete_Long<__Succ extends Succ_Out_U_Delete_Long> {

	__Succ send(U role, Delete op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
