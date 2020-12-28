package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_1;

public interface Select_C_P_Bye__P_Create_Product__P_GetOne_Long<__Succ1 extends Succ_Out_P_Bye, __Succ2 extends Succ_Out_P_Create_Product, __Succ3 extends Succ_Out_P_GetOne_Long> extends Out_P_Bye<__Succ1>, Out_P_Create_Product<__Succ2>, Out_P_GetOne_Long<__Succ3>, Succ_In_P_One_Product {
	Select_C_P_Bye__P_Create_Product__P_GetOne_Long<?, ?, ?> cast = null;

	@Override
	default Select_C_P_Bye__P_Create_Product__P_GetOne_Long<?, ?, ?> to(Select_C_P_Bye__P_Create_Product__P_GetOne_Long<?, ?, ?> cast) {
		return this;
	}

	default ProductSession_C_1 to(ProductSession_C_1 cast) {
		return (ProductSession_C_1) this;
	}
}
