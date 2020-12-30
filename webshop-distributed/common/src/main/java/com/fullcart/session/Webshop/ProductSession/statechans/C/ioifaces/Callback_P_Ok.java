package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Ok;

public interface Callback_P_Ok<__Succ extends Succ_In_P_Ok> {

	void receive(__Succ schan, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
