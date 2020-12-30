package com.fullcart.session.Webshop.UserSession.statechans.U;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.Select_U_C_NotFound__C_Ok;

import java.io.IOException;

public final class UserSession_U_7 extends org.scribble.runtime.statechans.OutputSocket<UserSession, U> implements Select_U_C_NotFound__C_Ok<UserSession_U_1, UserSession_U_1> {
	public static final UserSession_U_7 cast = null;

	protected UserSession_U_7(org.scribble.runtime.session.SessionEndpoint<UserSession, U> se, boolean dummy) {
		super(se);
	}

	public UserSession_U_1 send(C role, Ok op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.Ok);

		return new UserSession_U_1(this.se, true);
	}

	public UserSession_U_1 send(C role, NotFound op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, UserSession.NotFound);

		return new UserSession_U_1(this.se, true);
	}
}
