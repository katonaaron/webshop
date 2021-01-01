package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;

public interface Callback_B_UserNotFound_Long<__Succ extends Succ_In_B_UserNotFound_Long> {

	void receive(__Succ schan, UserNotFound op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
