package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.*;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Case_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product;

public final class ProductSession_P_1_Cases extends org.scribble.runtime.statechans.CaseSocket<ProductSession, P> implements Case_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<EndSocket, ProductSession_P_4, ProductSession_P_7, ProductSession_P_2, ProductSession_P_3, ProductSession_P_6, ProductSession_P_5> {
	public static final ProductSession_P_1_Cases cast = null;
	public final ProductSession_P_1.Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected ProductSession_P_1_Cases(org.scribble.runtime.session.SessionEndpoint<ProductSession, P> se, boolean dummy, ProductSession_P_1.Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public ProductSession_P_2 receive(C role, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.GetAll)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new ProductSession_P_2(this.se, true);
	}

	public ProductSession_P_2 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op);
	}

	public ProductSession_P_3 receive(C role, GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.GetOne)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new ProductSession_P_3(this.se, true);
	}

	public ProductSession_P_3 receive(GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_3 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public ProductSession_P_4 receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Create)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.ProductDTO) m.payload[0];
		return new ProductSession_P_4(this.se, true);
	}

	public ProductSession_P_4 receive(Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_4 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO>) this.se.gc);
	}

	public ProductSession_P_5 receive(C role, Update op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Update)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (com.fullcart.dto.ProductDTO) m.payload[1];
		return new ProductSession_P_5(this.se, true);
	}

	public ProductSession_P_5 receive(Update op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1, arg2);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_5 receive(Update op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO>) this.se.gc);
	}

	public ProductSession_P_6 receive(C role, Replace op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Replace)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (com.fullcart.dto.ProductDTO) m.payload[1];
		return new ProductSession_P_6(this.se, true);
	}

	public ProductSession_P_6 receive(Replace op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1, arg2);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_6 receive(Replace op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO>) this.se.gc);
	}

	public ProductSession_P_7 receive(C role, Delete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Delete)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new ProductSession_P_7(this.se, true);
	}

	public ProductSession_P_7 receive(Delete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public ProductSession_P_7 receive(Delete op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public com.fullcart.session.Webshop.ProductSession.statechans.P.EndSocket receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(ProductSession.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public com.fullcart.session.Webshop.ProductSession.statechans.P.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(ProductSession.C, op);
	}

	@Override
	public Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product.Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product_Enum getOp() {
		return this.op;
	}
}
