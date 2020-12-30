package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_6;

public interface Select_P_C_Created_Product__C_Err_String__C_Ok_Product<__Succ1 extends Succ_Out_C_Created_Product, __Succ2 extends Succ_Out_C_Err_String, __Succ3 extends Succ_Out_C_Ok_Product> extends Out_C_Created_Product<__Succ1>, Out_C_Err_String<__Succ2>, Out_C_Ok_Product<__Succ3>, Succ_In_C_Replace_Long_Product {
	Select_P_C_Created_Product__C_Err_String__C_Ok_Product<?, ?, ?> cast = null;

	@Override
	default Select_P_C_Created_Product__C_Err_String__C_Ok_Product<?, ?, ?> to(Select_P_C_Created_Product__C_Err_String__C_Ok_Product<?, ?, ?> cast) {
		return this;
	}

	default ProductSession_P_6 to(ProductSession_P_6 cast) {
		return (ProductSession_P_6) this;
	}
}
