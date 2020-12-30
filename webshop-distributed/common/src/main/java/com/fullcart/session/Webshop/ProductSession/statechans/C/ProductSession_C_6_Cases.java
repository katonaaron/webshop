package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.Created;
import com.fullcart.session.Webshop.ProductSession.ops.Err;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Branch_C_P_Created_Product__P_Err_String__P_Ok_Product;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Case_C_P_Created_Product__P_Err_String__P_Ok_Product;

public final class ProductSession_C_6_Cases extends org.scribble.runtime.statechans.CaseSocket<ProductSession, C> implements Case_C_P_Created_Product__P_Err_String__P_Ok_Product<ProductSession_C_1, ProductSession_C_1, ProductSession_C_1> {
	public static final ProductSession_C_6_Cases cast = null;
	public final ProductSession_C_6.Branch_C_P_Created_Product__P_Err_String__P_Ok_Product_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected ProductSession_C_6_Cases(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy, ProductSession_C_6.Branch_C_P_Created_Product__P_Err_String__P_Ok_Product_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public ProductSession_C_1 receive(P role, Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Ok)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.ProductDTO) m.payload[0];
		return new ProductSession_C_1(this.se, true);
	}

	public ProductSession_C_1 receive(Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.P, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_C_1 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO>) this.se.gc);
	}

	public ProductSession_C_1 receive(P role, Created op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Created)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.ProductDTO) m.payload[0];
		return new ProductSession_C_1(this.se, true);
	}

	public ProductSession_C_1 receive(Created op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.P, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_C_1 receive(Created op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO>) this.se.gc);
	}

	public ProductSession_C_1 receive(P role, Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Err)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new ProductSession_C_1(this.se, true);
	}

	public ProductSession_C_1 receive(Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.P, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_C_1 receive(Err op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	@Override
	public Branch_C_P_Created_Product__P_Err_String__P_Ok_Product.Branch_C_P_Created_Product__P_Err_String__P_Ok_Product_Enum getOp() {
		return this.op;
	}
}
