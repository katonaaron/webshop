package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_NotFound<__Succ extends Succ_Out_C_NotFound> {

	__Succ send(C role, NotFound op) throws org.scribble.main.ScribRuntimeException, IOException;
}
