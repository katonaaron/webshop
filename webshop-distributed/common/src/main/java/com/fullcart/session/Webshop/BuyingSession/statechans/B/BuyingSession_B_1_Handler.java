package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.ops.*;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long;

public interface BuyingSession_B_1_Handler extends Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<BuyingSession_B_13, BuyingSession_B_11, BuyingSession_B_12, BuyingSession_B_4, BuyingSession_B_2, BuyingSession_B_3> {

	@Override
    void receive(BuyingSession_B_2 schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_3 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_4 schan, Create op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_11 schan, Cancel op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_12 schan, Complete op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_13 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
