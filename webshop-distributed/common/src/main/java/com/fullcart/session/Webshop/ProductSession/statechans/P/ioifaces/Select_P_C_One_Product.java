package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_2;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_3;

public interface Select_P_C_One_Product<__Succ1 extends Succ_Out_C_One_Product> extends Out_C_One_Product<__Succ1>, Succ_In_C_GetOne_Long, Succ_In_C_Create_Product {
	Select_P_C_One_Product<?> cast = null;

	@Override
	default Select_P_C_One_Product<?> to(Select_P_C_One_Product<?> cast) {
		return this;
	}

	default ProductSession_P_2 to(ProductSession_P_2 cast) {
		return (ProductSession_P_2) this;
	}

	default ProductSession_P_3 to(ProductSession_P_3 cast) {
		return (ProductSession_P_3) this;
	}
}
