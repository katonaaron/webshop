package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;

public interface Callback_P_NotFound<__Succ extends Succ_In_P_NotFound> {

	void receive(__Succ schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
