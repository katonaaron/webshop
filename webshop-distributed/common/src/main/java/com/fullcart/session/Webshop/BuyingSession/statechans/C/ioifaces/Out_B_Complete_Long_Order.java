package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Complete;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Complete_Long_Order<__Succ extends Succ_Out_B_Complete_Long_Order> {

	__Succ send(B role, Complete op, java.lang.Long arg0, com.fullcart.dto.OrderDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}
