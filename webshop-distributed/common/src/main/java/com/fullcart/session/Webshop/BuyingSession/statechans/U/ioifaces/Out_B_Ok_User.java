package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Ok_User<__Succ extends Succ_Out_B_Ok_User> {

	__Succ send(B role, Ok op, com.fullcart.dto.UserDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
