package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Created;
import com.fullcart.session.Webshop.UserSession.roles.C;

import java.io.IOException;

public interface Out_C_Created_User<__Succ extends Succ_Out_C_Created_User> {

	__Succ send(C role, Created op, com.fullcart.dto.UserDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
