package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_NotAllowed<__Succ extends Succ_Out_C_NotAllowed> {

	__Succ send(C role, NotAllowed op) throws org.scribble.main.ScribRuntimeException, IOException;
}
