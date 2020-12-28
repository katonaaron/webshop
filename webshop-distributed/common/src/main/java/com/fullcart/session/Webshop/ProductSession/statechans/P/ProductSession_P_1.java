package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.*;

import java.io.IOException;

public final class ProductSession_P_1 extends org.scribble.runtime.statechans.BranchSocket<ProductSession, P> implements Branch_P_C_Bye__C_Create_Product__C_GetOne_Long<ProductSession_P_4, ProductSession_P_3, ProductSession_P_2> {
	public static final ProductSession_P_1 cast = null;

	protected ProductSession_P_1(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy) {
		super(se);
	}

	public ProductSession_P_1(org.scribble.runtime.session.MPSTEndpoint<ProductSession, P> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public ProductSession_P_1_Cases branch(C role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.C);
		Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum openum;
		if (m.op.equals(ProductSession.GetOne)) {
			openum = Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum.GetOne;
		}
		else if (m.op.equals(ProductSession.Create)) {
			openum = Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum.Create;
		}
		else if (m.op.equals(ProductSession.Bye)) {
			openum = Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum.Bye;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new ProductSession_P_1_Cases(this.se, true, openum, m);
	}

	public void branch(C role, ProductSession_P_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<ProductSession_P_4, ProductSession_P_3, ProductSession_P_2>) handler);
	}

	@Override
	public void branch(C role, Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<ProductSession_P_4, ProductSession_P_3, ProductSession_P_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.C);
		if (m.op.equals(ProductSession.GetOne)) {
			handler.receive(new ProductSession_P_2(this.se, true), ProductSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(ProductSession.Create)) {
			handler.receive(new ProductSession_P_3(this.se, true), ProductSession.Create, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.ProductDTO) m.payload[0]));
		}
		else
		if (m.op.equals(ProductSession.Bye)) {
			handler.receive(new ProductSession_P_4(this.se, true), ProductSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(C role, Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<Succ_In_C_Bye, Succ_In_C_Create_Product, Succ_In_C_GetOne_Long> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.C);
		if (m.op.equals(ProductSession.GetOne)) {
			handler.receive(new ProductSession_P_2(this.se, true), ProductSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(ProductSession.Create)) {
			handler.receive(new ProductSession_P_3(this.se, true), ProductSession.Create, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.ProductDTO) m.payload[0]));
		}
		else
		if (m.op.equals(ProductSession.Bye)) {
			handler.receive(new ProductSession_P_4(this.se, true), ProductSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
