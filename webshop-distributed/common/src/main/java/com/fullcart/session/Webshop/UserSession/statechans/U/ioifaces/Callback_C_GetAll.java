package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.GetAll;

public interface Callback_C_GetAll<__Succ extends Succ_In_C_GetAll> {

	void receive(__Succ schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
