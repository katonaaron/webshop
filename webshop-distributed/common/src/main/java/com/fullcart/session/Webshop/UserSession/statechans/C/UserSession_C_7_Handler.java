package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Handle_C_U_NotFound__U_Ok;

public interface UserSession_C_7_Handler extends Handle_C_U_NotFound__U_Ok<UserSession_C_1, UserSession_C_1> {

	@Override
    void receive(UserSession_C_1 schan, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_C_1 schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
