package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Create;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Create_Order<__Succ extends Succ_Out_B_Create_Order> {

	__Succ send(B role, Create op, com.fullcart.dto.OrderDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
