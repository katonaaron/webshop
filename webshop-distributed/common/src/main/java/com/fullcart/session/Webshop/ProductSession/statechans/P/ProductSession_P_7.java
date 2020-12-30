package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Select_P_C_NotFound__C_Ok;

import java.io.IOException;

public final class ProductSession_P_7 extends org.scribble.runtime.statechans.OutputSocket<ProductSession, P> implements Select_P_C_NotFound__C_Ok<ProductSession_P_1, ProductSession_P_1> {
	public static final ProductSession_P_7 cast = null;

	protected ProductSession_P_7(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy) {
		super(se);
	}

	public ProductSession_P_1 send(C role, Ok op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Ok);

		return new ProductSession_P_1(this.se, true);
	}

	public ProductSession_P_1 send(C role, NotFound op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.NotFound);

		return new ProductSession_P_1(this.se, true);
	}
}
