package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.NotFound;

public interface Callback_P_NotFound<__Succ extends Succ_In_P_NotFound> {

	void receive(__Succ schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
