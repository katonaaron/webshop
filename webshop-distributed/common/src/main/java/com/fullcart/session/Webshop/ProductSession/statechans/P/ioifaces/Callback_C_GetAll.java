package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.GetAll;

public interface Callback_C_GetAll<__Succ extends Succ_In_C_GetAll> {

	void receive(__Succ schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
