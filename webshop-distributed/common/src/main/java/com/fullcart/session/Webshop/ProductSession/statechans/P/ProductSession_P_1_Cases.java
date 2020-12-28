package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.ops.GetOne;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Branch_P_C_Bye__C_Create_Product__C_GetOne_Long;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Case_P_C_Bye__C_Create_Product__C_GetOne_Long;

public final class ProductSession_P_1_Cases extends org.scribble.runtime.statechans.CaseSocket<ProductSession, P> implements Case_P_C_Bye__C_Create_Product__C_GetOne_Long<ProductSession_P_4, ProductSession_P_3, ProductSession_P_2> {
	public static final ProductSession_P_1_Cases cast = null;
	public final ProductSession_P_1.Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected ProductSession_P_1_Cases(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy, ProductSession_P_1.Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public ProductSession_P_2 receive(C role, GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.GetOne)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new ProductSession_P_2(this.se, true);
	}

	public ProductSession_P_2 receive(GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_2 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public ProductSession_P_3 receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Create)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.ProductDTO) m.payload[0];
		return new ProductSession_P_3(this.se, true);
	}

	public ProductSession_P_3 receive(Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_3 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO>) this.se.gc);
	}

	public ProductSession_P_4 receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new ProductSession_P_4(this.se, true);
	}

	public ProductSession_P_4 receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op);
	}

	@Override
	public Branch_P_C_Bye__C_Create_Product__C_GetOne_Long.Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum getOp() {
		return this.op;
	}
}
