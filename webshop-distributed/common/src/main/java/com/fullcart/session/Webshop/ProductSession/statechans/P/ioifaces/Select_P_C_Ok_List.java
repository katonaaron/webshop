package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_2;

public interface Select_P_C_Ok_List<__Succ1 extends Succ_Out_C_Ok_List> extends Out_C_Ok_List<__Succ1>, Succ_In_C_GetAll {
	Select_P_C_Ok_List<?> cast = null;

	@Override
	default Select_P_C_Ok_List<?> to(Select_P_C_Ok_List<?> cast) {
		return this;
	}

	default ProductSession_P_2 to(ProductSession_P_2 cast) {
		return (ProductSession_P_2) this;
	}
}
