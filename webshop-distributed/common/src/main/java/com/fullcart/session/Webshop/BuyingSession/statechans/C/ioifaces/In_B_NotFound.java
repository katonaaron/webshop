package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_NotFound<__Succ extends Succ_In_B_NotFound> {

	__Succ receive(B role, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
