package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_4;

public interface Receive_C_P_Bye<__Succ1 extends Succ_In_P_Bye> extends In_P_Bye<__Succ1>, Succ_Out_P_Bye {
	Receive_C_P_Bye<?> cast = null;

	com.fullcart.session.Webshop.ProductSession.statechans.C.EndSocket async(P role, Bye op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_C_P_Bye<?> to(Receive_C_P_Bye<?> cast) {
		return this;
	}

	default ProductSession_C_4 to(ProductSession_C_4 cast) {
		return (ProductSession_C_4) this;
	}
}
