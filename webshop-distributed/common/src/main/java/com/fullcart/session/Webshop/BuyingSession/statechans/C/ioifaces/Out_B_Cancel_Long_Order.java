package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Cancel;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Cancel_Long_Order<__Succ extends Succ_Out_B_Cancel_Long_Order> {

	__Succ send(B role, Cancel op, java.lang.Long arg0, com.fullcart.dto.OrderDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}
