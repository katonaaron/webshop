package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_Ok_Order<__Succ extends Succ_Out_C_Ok_Order> {

	__Succ send(C role, Ok op, com.fullcart.dto.OrderDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
