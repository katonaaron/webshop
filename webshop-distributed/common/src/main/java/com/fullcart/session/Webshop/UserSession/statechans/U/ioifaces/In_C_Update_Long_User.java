package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Update;
import com.fullcart.session.Webshop.UserSession.roles.C;

public interface In_C_Update_Long_User<__Succ extends Succ_In_C_Update_Long_User> {

	__Succ receive(C role, Update op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
