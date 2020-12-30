package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Branch_C_P_NotFound__P_Ok;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Handle_C_P_NotFound__P_Ok;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Succ_In_P_NotFound;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Succ_In_P_Ok;

import java.io.IOException;

public final class ProductSession_C_7 extends org.scribble.runtime.statechans.BranchSocket<ProductSession, C> implements Branch_C_P_NotFound__P_Ok<ProductSession_C_1, ProductSession_C_1> {
	public static final ProductSession_C_7 cast = null;

	protected ProductSession_C_7(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public ProductSession_C_7_Cases branch(P role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		Branch_C_P_NotFound__P_Ok_Enum openum;
		if (m.op.equals(ProductSession.Ok)) {
			openum = Branch_C_P_NotFound__P_Ok_Enum.Ok;
		}
		else if (m.op.equals(ProductSession.NotFound)) {
			openum = Branch_C_P_NotFound__P_Ok_Enum.NotFound;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new ProductSession_C_7_Cases(this.se, true, openum, m);
	}

	public void branch(P role, ProductSession_C_7_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_P_NotFound__P_Ok<ProductSession_C_1, ProductSession_C_1>) handler);
	}

	@Override
	public void branch(P role, Handle_C_P_NotFound__P_Ok<ProductSession_C_1, ProductSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		if (m.op.equals(ProductSession.Ok)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.Ok);
		}
		else
		if (m.op.equals(ProductSession.NotFound)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(P role, Handle_C_P_NotFound__P_Ok<Succ_In_P_NotFound, Succ_In_P_Ok> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		if (m.op.equals(ProductSession.Ok)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.Ok);
		}
		else
		if (m.op.equals(ProductSession.NotFound)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
