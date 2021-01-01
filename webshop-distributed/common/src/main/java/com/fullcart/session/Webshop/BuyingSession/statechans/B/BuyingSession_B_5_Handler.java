package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Handle_B_U_NotFound_Long__U_Ok_User;

public interface BuyingSession_B_5_Handler extends Handle_B_U_NotFound_Long__U_Ok_User<BuyingSession_B_10, BuyingSession_B_6> {

	@Override
    void receive(BuyingSession_B_6 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(BuyingSession_B_10 schan, NotFound op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
