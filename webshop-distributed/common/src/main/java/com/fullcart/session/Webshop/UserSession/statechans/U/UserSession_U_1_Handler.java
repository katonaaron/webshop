package com.fullcart.session.Webshop.UserSession.statechans.U;

import com.fullcart.session.Webshop.UserSession.ops.*;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User;

public interface UserSession_U_1_Handler extends Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<EndSocket, UserSession_U_4, UserSession_U_7, UserSession_U_2, UserSession_U_3, UserSession_U_6, UserSession_U_5> {

	@Override
    void receive(UserSession_U_2 schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_U_3 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_U_4 schan, Create op, org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_U_5 schan, Update op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_U_6 schan, Replace op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(UserSession_U_7 schan, Delete op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(EndSocket schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
