package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_UserNotFound<__Succ extends Succ_Out_C_UserNotFound> {

	__Succ send(C role, UserNotFound op) throws org.scribble.main.ScribRuntimeException, IOException;
}