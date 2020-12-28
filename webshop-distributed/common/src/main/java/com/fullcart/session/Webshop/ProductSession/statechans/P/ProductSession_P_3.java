package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.One;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Select_P_C_One_Product;

import java.io.IOException;

public final class ProductSession_P_3 extends org.scribble.runtime.statechans.OutputSocket<ProductSession, P> implements Select_P_C_One_Product<ProductSession_P_1> {
	public static final ProductSession_P_3 cast = null;

	protected ProductSession_P_3(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy) {
		super(se);
	}

	public ProductSession_P_1 send(C role, One op, com.fullcart.dto.ProductDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.One, arg0);

		return new ProductSession_P_1(this.se, true);
	}
}
