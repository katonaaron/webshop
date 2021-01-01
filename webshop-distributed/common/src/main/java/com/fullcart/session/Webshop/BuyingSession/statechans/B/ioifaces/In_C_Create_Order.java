package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Create;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

public interface In_C_Create_Order<__Succ extends Succ_In_C_Create_Order> {

	__Succ receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
