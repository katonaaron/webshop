package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.GetOne;
import com.fullcart.session.Webshop.BuyingSession.roles.U;

import java.io.IOException;

public interface Out_U_GetOne_Long<__Succ extends Succ_Out_U_GetOne_Long> {

	__Succ send(U role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
