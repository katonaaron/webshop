package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;
import com.fullcart.session.Webshop.BuyingSession.roles.P;

import java.io.IOException;

public interface Out_P_GetAll_List<__Succ extends Succ_Out_P_GetAll_List> {

	__Succ send(P role, GetAll op, java.lang.Iterable arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
