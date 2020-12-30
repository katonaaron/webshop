package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Branch_C_P_Err_String__P_Ok_Product;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Handle_C_P_Err_String__P_Ok_Product;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Succ_In_P_Err_String;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Succ_In_P_Ok_Product;

import java.io.IOException;

public final class ProductSession_C_4 extends org.scribble.runtime.statechans.BranchSocket<ProductSession, C> implements Branch_C_P_Err_String__P_Ok_Product<ProductSession_C_1, ProductSession_C_1> {
	public static final ProductSession_C_4 cast = null;

	protected ProductSession_C_4(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public ProductSession_C_4_Cases branch(P role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		Branch_C_P_Err_String__P_Ok_Product_Enum openum;
		if (m.op.equals(ProductSession.Ok)) {
			openum = Branch_C_P_Err_String__P_Ok_Product_Enum.Ok;
		}
		else if (m.op.equals(ProductSession.Err)) {
			openum = Branch_C_P_Err_String__P_Ok_Product_Enum.Err;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new ProductSession_C_4_Cases(this.se, true, openum, m);
	}

	public void branch(P role, ProductSession_C_4_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_P_Err_String__P_Ok_Product<ProductSession_C_1, ProductSession_C_1>) handler);
	}

	@Override
	public void branch(P role, Handle_C_P_Err_String__P_Ok_Product<ProductSession_C_1, ProductSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		if (m.op.equals(ProductSession.Ok)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.ProductDTO) m.payload[0]));
		}
		else
		if (m.op.equals(ProductSession.Err)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.Err, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(P role, Handle_C_P_Err_String__P_Ok_Product<Succ_In_P_Err_String, Succ_In_P_Ok_Product> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(ProductSession.P);
		if (m.op.equals(ProductSession.Ok)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.ProductDTO) m.payload[0]));
		}
		else
		if (m.op.equals(ProductSession.Err)) {
			handler.receive(new ProductSession_C_1(this.se, true), ProductSession.Err, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
