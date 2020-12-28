package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Select_P_C_Bye;

import java.io.IOException;

public final class ProductSession_P_4 extends org.scribble.runtime.statechans.OutputSocket<ProductSession, P> implements Select_P_C_Bye<EndSocket> {
	public static final ProductSession_P_4 cast = null;

	protected ProductSession_P_4(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy) {
		super(se);
	}

	public com.fullcart.session.Webshop.ProductSession.statechans.P.EndSocket send(C role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Bye);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}
