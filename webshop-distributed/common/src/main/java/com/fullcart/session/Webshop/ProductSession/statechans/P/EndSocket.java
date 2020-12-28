package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Succ_Out_C_Bye;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<ProductSession, P> implements Succ_Out_C_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return this;
	}
}
