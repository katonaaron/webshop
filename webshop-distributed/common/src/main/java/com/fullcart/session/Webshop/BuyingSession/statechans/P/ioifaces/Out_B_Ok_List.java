package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Ok_List<__Succ extends Succ_Out_B_Ok_List> {

	__Succ send(B role, Ok op, java.lang.Iterable arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
