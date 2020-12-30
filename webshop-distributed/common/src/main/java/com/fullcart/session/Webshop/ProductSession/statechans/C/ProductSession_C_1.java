package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ProductSession;
import com.fullcart.session.Webshop.ProductSession.ops.*;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Select_C_P_Bye__P_Create_Product__P_Delete_Long__P_GetAll__P_GetOne_Long__P_Replace_Long_Product__P_Update_Long_Product;

import java.io.IOException;

public final class ProductSession_C_1 extends org.scribble.runtime.statechans.OutputSocket<ProductSession, C> implements Select_C_P_Bye__P_Create_Product__P_Delete_Long__P_GetAll__P_GetOne_Long__P_Replace_Long_Product__P_Update_Long_Product<EndSocket, ProductSession_C_4, ProductSession_C_7, ProductSession_C_2, ProductSession_C_3, ProductSession_C_6, ProductSession_C_5> {
	public static final ProductSession_C_1 cast = null;

	protected ProductSession_C_1(org.scribble.runtime.session.SessionEndpoint<ProductSession, C> se, boolean dummy) {
		super(se);
	}

	public ProductSession_C_1(org.scribble.runtime.session.MPSTEndpoint<ProductSession, C> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public ProductSession_C_2 send(P role, GetAll op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.GetAll);

		return new ProductSession_C_2(this.se, true);
	}

	public ProductSession_C_3 send(P role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.GetOne, arg0);

		return new ProductSession_C_3(this.se, true);
	}

	public ProductSession_C_4 send(P role, Create op, com.fullcart.dto.ProductDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Create, arg0);

		return new ProductSession_C_4(this.se, true);
	}

	public ProductSession_C_5 send(P role, Update op, java.lang.Long arg0, com.fullcart.dto.ProductDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Update, arg0, arg1);

		return new ProductSession_C_5(this.se, true);
	}

	public ProductSession_C_6 send(P role, Replace op, java.lang.Long arg0, com.fullcart.dto.ProductDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Replace, arg0, arg1);

		return new ProductSession_C_6(this.se, true);
	}

	public ProductSession_C_7 send(P role, Delete op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Delete, arg0);

		return new ProductSession_C_7(this.se, true);
	}

	public com.fullcart.session.Webshop.ProductSession.statechans.C.EndSocket send(P role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, ProductSession.Bye);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}
