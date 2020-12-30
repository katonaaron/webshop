package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Handle_C_B_NotAllowed__B_Ok_Order;

public interface BuyingSession_C_6_Handler extends Handle_C_B_NotAllowed__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1> {

	@Override
    void receive(BuyingSession_C_1 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_C_1 schan, NotAllowed op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
