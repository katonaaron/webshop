package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.ops.Err;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Handle_C_U_Err_String__U_Ok_User;

public interface UserSession_C_4_Handler extends Handle_C_U_Err_String__U_Ok_User<UserSession_C_1, UserSession_C_1> {

	@Override
    void receive(UserSession_C_1 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_C_1 schan, Err op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
