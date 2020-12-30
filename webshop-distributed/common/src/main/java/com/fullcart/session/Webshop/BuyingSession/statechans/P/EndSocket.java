package com.fullcart.session.Webshop.BuyingSession.statechans.P;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Succ_In_B_Bye;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<BuyingSession, P> implements Succ_In_B_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<BuyingSession, P> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return this;
	}
}
