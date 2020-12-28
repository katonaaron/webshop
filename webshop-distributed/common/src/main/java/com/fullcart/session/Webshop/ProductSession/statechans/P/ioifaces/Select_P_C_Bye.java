package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_4;

public interface Select_P_C_Bye<__Succ1 extends Succ_Out_C_Bye> extends Out_C_Bye<__Succ1>, Succ_In_C_Bye {
	Select_P_C_Bye<?> cast = null;

	@Override
	default Select_P_C_Bye<?> to(Select_P_C_Bye<?> cast) {
		return this;
	}

	default ProductSession_P_4 to(ProductSession_P_4 cast) {
		return (ProductSession_P_4) this;
	}
}
