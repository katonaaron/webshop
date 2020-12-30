package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.U;

public interface In_U_Ok_User<__Succ extends Succ_In_U_Ok_User> {

	__Succ receive(U role, Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
