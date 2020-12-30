package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;

public interface Callback_B_Ok_Order<__Succ extends Succ_In_B_Ok_Order> {

	void receive(__Succ schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
