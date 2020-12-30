package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Cancel;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

public interface In_C_Cancel_Long_Order<__Succ extends Succ_In_C_Cancel_Long_Order> {

	__Succ receive(C role, Cancel op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.OrderDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
