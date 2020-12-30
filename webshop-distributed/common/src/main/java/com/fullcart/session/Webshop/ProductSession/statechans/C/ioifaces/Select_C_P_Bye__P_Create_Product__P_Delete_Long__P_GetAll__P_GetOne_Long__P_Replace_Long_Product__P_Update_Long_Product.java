package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_1;

public interface Select_C_P_Bye__P_Create_Product__P_Delete_Long__P_GetAll__P_GetOne_Long__P_Replace_Long_Product__P_Update_Long_Product<__Succ1 extends Succ_Out_P_Bye, __Succ2 extends Succ_Out_P_Create_Product, __Succ3 extends Succ_Out_P_Delete_Long, __Succ4 extends Succ_Out_P_GetAll, __Succ5 extends Succ_Out_P_GetOne_Long, __Succ6 extends Succ_Out_P_Replace_Long_Product, __Succ7 extends Succ_Out_P_Update_Long_Product> extends Out_P_Bye<__Succ1>, Out_P_Create_Product<__Succ2>, Out_P_Delete_Long<__Succ3>, Out_P_GetAll<__Succ4>, Out_P_GetOne_Long<__Succ5>, Out_P_Replace_Long_Product<__Succ6>, Out_P_Update_Long_Product<__Succ7>, Succ_In_P_Ok_Product, Succ_In_P_Err_String, Succ_In_P_Ok_List, Succ_In_P_Created_Product, Succ_In_P_NotFound, Succ_In_P_Ok {
	Select_C_P_Bye__P_Create_Product__P_Delete_Long__P_GetAll__P_GetOne_Long__P_Replace_Long_Product__P_Update_Long_Product<?, ?, ?, ?, ?, ?, ?> cast = null;

	@Override
	default Select_C_P_Bye__P_Create_Product__P_Delete_Long__P_GetAll__P_GetOne_Long__P_Replace_Long_Product__P_Update_Long_Product<?, ?, ?, ?, ?, ?, ?> to(Select_C_P_Bye__P_Create_Product__P_Delete_Long__P_GetAll__P_GetOne_Long__P_Replace_Long_Product__P_Update_Long_Product<?, ?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default ProductSession_C_1 to(ProductSession_C_1 cast) {
		return (ProductSession_C_1) this;
	}
}
