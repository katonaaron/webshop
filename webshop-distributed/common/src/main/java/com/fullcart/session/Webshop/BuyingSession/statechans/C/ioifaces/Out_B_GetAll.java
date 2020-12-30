package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_GetAll<__Succ extends Succ_Out_B_GetAll> {

	__Succ send(B role, GetAll op) throws org.scribble.main.ScribRuntimeException, IOException;
}
