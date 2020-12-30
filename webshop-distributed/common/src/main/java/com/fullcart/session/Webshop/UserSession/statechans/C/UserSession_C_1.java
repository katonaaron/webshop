package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.*;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Select_C_U_Bye__U_Create_User__U_Delete_Long__U_GetAll__U_GetOne_Long__U_Replace_Long_User__U_Update_Long_User;

import java.io.IOException;

public final class UserSession_C_1 extends org.scribble.runtime.statechans.OutputSocket<UserSession, C> implements Select_C_U_Bye__U_Create_User__U_Delete_Long__U_GetAll__U_GetOne_Long__U_Replace_Long_User__U_Update_Long_User<EndSocket, UserSession_C_4, UserSession_C_7, UserSession_C_2, UserSession_C_3, UserSession_C_6, UserSession_C_5> {
	public static final UserSession_C_1 cast = null;

	protected UserSession_C_1(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy) {
		super(se);
	}

	public UserSession_C_1(org.scribble.runtime.session.MPSTEndpoint<UserSession, C> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public UserSession_C_2 send(U role, GetAll op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.GetAll);

		return new UserSession_C_2(this.se, true);
	}

	public UserSession_C_3 send(U role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.GetOne, arg0);

		return new UserSession_C_3(this.se, true);
	}

	public UserSession_C_4 send(U role, Create op, com.fullcart.dto.UserDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Create, arg0);

		return new UserSession_C_4(this.se, true);
	}

	public UserSession_C_5 send(U role, Update op, java.lang.Long arg0, com.fullcart.dto.UserDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Update, arg0, arg1);

		return new UserSession_C_5(this.se, true);
	}

	public UserSession_C_6 send(U role, Replace op, java.lang.Long arg0, com.fullcart.dto.UserDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Replace, arg0, arg1);

		return new UserSession_C_6(this.se, true);
	}

	public UserSession_C_7 send(U role, Delete op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Delete, arg0);

		return new UserSession_C_7(this.se, true);
	}

	public com.fullcart.session.Webshop.UserSession.statechans.C.EndSocket send(U role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Bye);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}
