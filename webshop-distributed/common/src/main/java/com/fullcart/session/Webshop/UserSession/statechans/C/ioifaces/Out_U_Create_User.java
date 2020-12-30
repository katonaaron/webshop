package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Create;
import com.fullcart.session.Webshop.UserSession.roles.U;

import java.io.IOException;

public interface Out_U_Create_User<__Succ extends Succ_Out_U_Create_User> {

	__Succ send(U role, Create op, com.fullcart.dto.UserDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
