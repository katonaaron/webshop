package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Receive_C_P_Bye;

public final class ProductSession_C_4 extends org.scribble.runtime.statechans.ReceiveSocket<ProductSession, C> implements Receive_C_P_Bye<EndSocket> {
	public static final ProductSession_C_4 cast = null;

	protected ProductSession_C_4(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	public com.fullcart.session.Webshop.ProductSession.statechans.C.EndSocket receive(P role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.readScribMessage(ProductSession.P);
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public com.fullcart.session.Webshop.ProductSession.statechans.C.EndSocket async(P role, Bye op, org.scribble.runtime.util.Buf<ProductSession_C_4_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new ProductSession_C_4_Future(super.getFuture(ProductSession.P));
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(ProductSession.P);
	}

	@SuppressWarnings("unchecked")
	public com.fullcart.session.Webshop.ProductSession.statechans.C.EndSocket async(P role, Bye op) throws org.scribble.main.ScribRuntimeException {
		return async(ProductSession.P, op, (org.scribble.runtime.util.Buf<ProductSession_C_4_Future>) this.se.gc);
	}
}
