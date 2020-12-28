package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.GetOne;
import com.fullcart.session.Webshop.ProductSession.roles.P;

import java.io.IOException;

public interface Out_P_GetOne_Long<__Succ extends Succ_Out_P_GetOne_Long> {

	__Succ send(P role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
