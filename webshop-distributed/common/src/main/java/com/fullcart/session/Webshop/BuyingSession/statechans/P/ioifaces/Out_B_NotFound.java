package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_NotFound<__Succ extends Succ_Out_B_NotFound> {

	__Succ send(B role, NotFound op) throws org.scribble.main.ScribRuntimeException, IOException;
}
