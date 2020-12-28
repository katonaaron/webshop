package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.One;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_2;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_3;

public interface Receive_C_P_One_Product<__Succ1 extends Succ_In_P_One_Product> extends In_P_One_Product<__Succ1>, Succ_Out_P_GetOne_Long, Succ_Out_P_Create_Product {
	Receive_C_P_One_Product<?> cast = null;

	__Succ1 async(P role, One op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_C_P_One_Product<?> to(Receive_C_P_One_Product<?> cast) {
		return this;
	}

	default ProductSession_C_2 to(ProductSession_C_2 cast) {
		return (ProductSession_C_2) this;
	}

	default ProductSession_C_3 to(ProductSession_C_3 cast) {
		return (ProductSession_C_3) this;
	}
}
