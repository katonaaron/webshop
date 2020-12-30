package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;

public interface Callback_B_NotFound<__Succ extends Succ_In_B_NotFound> {

	void receive(__Succ schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
