package com.fullcart.session.Webshop.UserSession.statechans.U;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.Succ_In_C_Bye;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<UserSession, U> implements Succ_In_C_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<UserSession, U> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return this;
	}
}
