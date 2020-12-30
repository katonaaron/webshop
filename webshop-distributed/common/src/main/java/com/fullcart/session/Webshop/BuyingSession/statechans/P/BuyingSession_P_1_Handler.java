package com.fullcart.session.Webshop.BuyingSession.statechans.P;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Handle_P_B_Bye__B_GetAll_List;

public interface BuyingSession_P_1_Handler extends Handle_P_B_Bye__B_GetAll_List<EndSocket, BuyingSession_P_2> {

	@Override
    void receive(BuyingSession_P_2 schan, GetAll op, org.scribble.runtime.util.Buf<java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(EndSocket schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
