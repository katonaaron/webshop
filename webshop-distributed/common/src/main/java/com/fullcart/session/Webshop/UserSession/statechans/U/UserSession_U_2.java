package com.fullcart.session.Webshop.UserSession.statechans.U;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.Select_U_C_Ok_List;

import java.io.IOException;

public final class UserSession_U_2 extends org.scribble.runtime.statechans.OutputSocket<UserSession, U> implements Select_U_C_Ok_List<UserSession_U_1> {
	public static final UserSession_U_2 cast = null;

	protected UserSession_U_2(org.scribble.runtime.session.SessionEndpoint<UserSession, U> se, boolean dummy) {
		super(se);
	}

	public UserSession_U_1 send(C role, Ok op, java.lang.Iterable arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Ok, arg0);

		return new UserSession_U_1(this.se, true);
	}
}
