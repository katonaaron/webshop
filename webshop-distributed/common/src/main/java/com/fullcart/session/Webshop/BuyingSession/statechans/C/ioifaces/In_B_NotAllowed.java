package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_NotAllowed<__Succ extends Succ_In_B_NotAllowed> {

	__Succ receive(B role, NotAllowed op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
