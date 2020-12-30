package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_UserNotFound<__Succ extends Succ_In_B_UserNotFound> {

	__Succ receive(B role, UserNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
