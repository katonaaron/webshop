package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Branch_C_P_NotFound__P_Ok;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Case_C_P_NotFound__P_Ok;

public final class ProductSession_C_7_Cases extends org.scribble.runtime.statechans.CaseSocket<ProductSession, C> implements Case_C_P_NotFound__P_Ok<ProductSession_C_1, ProductSession_C_1> {
	public static final ProductSession_C_7_Cases cast = null;
	public final ProductSession_C_7.Branch_C_P_NotFound__P_Ok_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected ProductSession_C_7_Cases(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy, ProductSession_C_7.Branch_C_P_NotFound__P_Ok_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public ProductSession_C_1 receive(P role, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Ok)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new ProductSession_C_1(this.se, true);
	}

	public ProductSession_C_1 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.P, op);
	}

	public ProductSession_C_1 receive(P role, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.NotFound)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new ProductSession_C_1(this.se, true);
	}

	public ProductSession_C_1 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.P, op);
	}

	@Override
	public Branch_C_P_NotFound__P_Ok.Branch_C_P_NotFound__P_Ok_Enum getOp() {
		return this.op;
	}
}
