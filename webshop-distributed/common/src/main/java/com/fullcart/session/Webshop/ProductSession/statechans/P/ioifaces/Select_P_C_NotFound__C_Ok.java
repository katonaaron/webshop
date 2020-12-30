package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_7;

public interface Select_P_C_NotFound__C_Ok<__Succ1 extends Succ_Out_C_NotFound, __Succ2 extends Succ_Out_C_Ok> extends Out_C_NotFound<__Succ1>, Out_C_Ok<__Succ2>, Succ_In_C_Delete_Long {
	Select_P_C_NotFound__C_Ok<?, ?> cast = null;

	@Override
	default Select_P_C_NotFound__C_Ok<?, ?> to(Select_P_C_NotFound__C_Ok<?, ?> cast) {
		return this;
	}

	default ProductSession_P_7 to(ProductSession_P_7 cast) {
		return (ProductSession_P_7) this;
	}
}
