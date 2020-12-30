package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Cancel;

public interface Callback_C_Cancel_Long_Order<__Succ extends Succ_In_C_Cancel_Long_Order> {

	void receive(__Succ schan, Cancel op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
