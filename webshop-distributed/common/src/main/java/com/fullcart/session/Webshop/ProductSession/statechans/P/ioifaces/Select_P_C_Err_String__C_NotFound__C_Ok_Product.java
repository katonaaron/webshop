package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_5;

public interface Select_P_C_Err_String__C_NotFound__C_Ok_Product<__Succ1 extends Succ_Out_C_Err_String, __Succ2 extends Succ_Out_C_NotFound, __Succ3 extends Succ_Out_C_Ok_Product> extends Out_C_Err_String<__Succ1>, Out_C_NotFound<__Succ2>, Out_C_Ok_Product<__Succ3>, Succ_In_C_Update_Long_Product {
	Select_P_C_Err_String__C_NotFound__C_Ok_Product<?, ?, ?> cast = null;

	@Override
	default Select_P_C_Err_String__C_NotFound__C_Ok_Product<?, ?, ?> to(Select_P_C_Err_String__C_NotFound__C_Ok_Product<?, ?, ?> cast) {
		return this;
	}

	default ProductSession_P_5 to(ProductSession_P_5 cast) {
		return (ProductSession_P_5) this;
	}
}
