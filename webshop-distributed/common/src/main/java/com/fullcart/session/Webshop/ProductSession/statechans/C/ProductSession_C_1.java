package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.ops.GetOne;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Select_C_P_Bye__P_Create_Product__P_GetOne_Long;

import java.io.IOException;

public final class ProductSession_C_1 extends org.scribble.runtime.statechans.OutputSocket<ProductSession, C> implements Select_C_P_Bye__P_Create_Product__P_GetOne_Long<ProductSession_C_4, ProductSession_C_3, ProductSession_C_2> {
	public static final ProductSession_C_1 cast = null;

	protected ProductSession_C_1(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	public ProductSession_C_1(org.scribble.runtime.session.MPSTEndpoint<ProductSession, C> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public ProductSession_C_2 send(P role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.GetOne, arg0);

		return new ProductSession_C_2(this.se, true);
	}

	public ProductSession_C_3 send(P role, Create op, com.fullcart.dto.ProductDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Create, arg0);

		return new ProductSession_C_3(this.se, true);
	}

	public ProductSession_C_4 send(P role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Bye);

		return new ProductSession_C_4(this.se, true);
	}
}
