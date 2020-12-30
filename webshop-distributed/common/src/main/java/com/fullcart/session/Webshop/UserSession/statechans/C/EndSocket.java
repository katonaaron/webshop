package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Succ_Out_U_Bye;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<UserSession, C> implements Succ_Out_U_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return this;
	}
}
