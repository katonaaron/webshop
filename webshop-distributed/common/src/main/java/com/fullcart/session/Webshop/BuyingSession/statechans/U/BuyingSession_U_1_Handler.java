package com.fullcart.session.Webshop.BuyingSession.statechans.U;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetOne;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Handle_U_B_Bye__B_GetOne_Long;

public interface BuyingSession_U_1_Handler extends Handle_U_B_Bye__B_GetOne_Long<EndSocket, BuyingSession_U_2> {

	@Override
    void receive(BuyingSession_U_2 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(EndSocket schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
