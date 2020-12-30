package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;

public interface Callback_B_NotAllowed<__Succ extends Succ_In_B_NotAllowed> {

	void receive(__Succ schan, NotAllowed op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
