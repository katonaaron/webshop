package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Handle_B_P_NotFound__P_Ok_List;

public interface BuyingSession_B_7_Handler extends Handle_B_P_NotFound__P_Ok_List<BuyingSession_B_9, BuyingSession_B_8> {

	@Override
    void receive(BuyingSession_B_8 schan, Ok op, org.scribble.runtime.util.Buf<java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_9 schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
