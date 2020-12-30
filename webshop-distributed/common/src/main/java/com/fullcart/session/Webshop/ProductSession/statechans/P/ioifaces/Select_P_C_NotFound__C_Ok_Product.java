package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_3;

public interface Select_P_C_NotFound__C_Ok_Product<__Succ1 extends Succ_Out_C_NotFound, __Succ2 extends Succ_Out_C_Ok_Product> extends Out_C_NotFound<__Succ1>, Out_C_Ok_Product<__Succ2>, Succ_In_C_GetOne_Long {
	Select_P_C_NotFound__C_Ok_Product<?, ?> cast = null;

	@Override
	default Select_P_C_NotFound__C_Ok_Product<?, ?> to(Select_P_C_NotFound__C_Ok_Product<?, ?> cast) {
		return this;
	}

	default ProductSession_P_3 to(ProductSession_P_3 cast) {
		return (ProductSession_P_3) this;
	}
}
