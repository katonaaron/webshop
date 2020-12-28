package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.One;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Receive_C_P_One_Product;

public final class ProductSession_C_2 extends org.scribble.runtime.statechans.ReceiveSocket<ProductSession, C> implements Receive_C_P_One_Product<ProductSession_C_1> {
	public static final ProductSession_C_2 cast = null;

	protected ProductSession_C_2(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	public ProductSession_C_1 receive(P role, One op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		arg1.val = (com.fullcart.dto.ProductDTO) m.payload[0];
		return new ProductSession_C_1(this.se, true);
	}

	public ProductSession_C_1 async(P role, One op, org.scribble.runtime.util.Buf<ProductSession_C_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new ProductSession_C_2_Future(super.getFuture(ProductSession.P));
		return new ProductSession_C_1(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(ProductSession.P);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_C_1 async(P role, One op) throws org.scribble.main.ScribRuntimeException {
		return async(ProductSession.P, op, (org.scribble.runtime.util.Buf<ProductSession_C_2_Future>) this.se.gc);
	}
}
