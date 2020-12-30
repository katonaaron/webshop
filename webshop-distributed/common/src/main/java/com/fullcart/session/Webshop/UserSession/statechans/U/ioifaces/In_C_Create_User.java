package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Create;
import com.fullcart.session.Webshop.UserSession.roles.C;

public interface In_C_Create_User<__Succ extends Succ_In_C_Create_User> {

	__Succ receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
