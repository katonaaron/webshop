package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;

public interface Callback_B_UserNotFound<__Succ extends Succ_In_B_UserNotFound> {

	void receive(__Succ schan, UserNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
