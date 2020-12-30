package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Replace;
import com.fullcart.session.Webshop.UserSession.roles.U;

import java.io.IOException;

public interface Out_U_Replace_Long_User<__Succ extends Succ_Out_U_Replace_Long_User> {

	__Succ send(U role, Replace op, java.lang.Long arg0, com.fullcart.dto.UserDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}
