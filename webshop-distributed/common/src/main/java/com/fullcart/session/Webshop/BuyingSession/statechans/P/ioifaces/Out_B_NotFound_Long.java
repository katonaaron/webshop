package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_NotFound_Long<__Succ extends Succ_Out_B_NotFound_Long> {

	__Succ send(B role, NotFound op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
