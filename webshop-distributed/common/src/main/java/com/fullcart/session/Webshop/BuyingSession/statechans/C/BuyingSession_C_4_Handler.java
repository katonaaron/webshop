package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Handle_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound;

public interface BuyingSession_C_4_Handler extends Handle_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1> {

	@Override
    void receive(BuyingSession_C_1 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_C_1 schan, ProductNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_C_1 schan, UserNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
