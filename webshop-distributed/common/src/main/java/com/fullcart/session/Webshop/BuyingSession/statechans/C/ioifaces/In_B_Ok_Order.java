package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_Ok_Order<__Succ extends Succ_In_B_Ok_Order> {

	__Succ receive(B role, Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
