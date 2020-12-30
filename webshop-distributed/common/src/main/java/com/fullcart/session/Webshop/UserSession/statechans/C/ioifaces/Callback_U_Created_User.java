package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Created;

public interface Callback_U_Created_User<__Succ extends Succ_In_U_Created_User> {

	void receive(__Succ schan, Created op, org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
