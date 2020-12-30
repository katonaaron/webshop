package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_2;

public interface Receive_C_P_Ok_List<__Succ1 extends Succ_In_P_Ok_List> extends In_P_Ok_List<__Succ1>, Succ_Out_P_GetAll {
	Receive_C_P_Ok_List<?> cast = null;

	__Succ1 async(P role, Ok op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_C_P_Ok_List<?> to(Receive_C_P_Ok_List<?> cast) {
		return this;
	}

	default ProductSession_C_2 to(ProductSession_C_2 cast) {
		return (ProductSession_C_2) this;
	}
}
