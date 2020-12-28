package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Succ_In_P_Bye;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<ProductSession, C> implements Succ_In_P_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return this;
	}
}
