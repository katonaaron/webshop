package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.NotFound;

public interface Callback_U_NotFound<__Succ extends Succ_In_U_NotFound> {

	void receive(__Succ schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
