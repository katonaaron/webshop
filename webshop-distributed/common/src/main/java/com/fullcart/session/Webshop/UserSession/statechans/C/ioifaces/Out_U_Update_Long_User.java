package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Update;
import com.fullcart.session.Webshop.UserSession.roles.U;

import java.io.IOException;

public interface Out_U_Update_Long_User<__Succ extends Succ_Out_U_Update_Long_User> {

	__Succ send(U role, Update op, java.lang.Long arg0, com.fullcart.dto.UserDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}
