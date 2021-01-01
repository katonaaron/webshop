package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_1;

public interface Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<__Succ1 extends Succ_Out_B_Bye, __Succ2 extends Succ_Out_B_Cancel_Long, __Succ3 extends Succ_Out_B_Complete_Long, __Succ4 extends Succ_Out_B_Create_Order, __Succ5 extends Succ_Out_B_GetAll, __Succ6 extends Succ_Out_B_GetOne_Long> extends Out_B_Bye<__Succ1>, Out_B_Cancel_Long<__Succ2>, Out_B_Complete_Long<__Succ3>, Out_B_Create_Order<__Succ4>, Out_B_GetAll<__Succ5>, Out_B_GetOne_Long<__Succ6>, Succ_In_B_NotAllowed, Succ_In_B_NotFound, Succ_In_B_UserNotFound_Long, Succ_In_B_Err_String, Succ_In_B_ProductNotFound_Long, Succ_In_B_Ok_Order, Succ_In_B_Ok_List {
	Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> cast = null;

	@Override
	default Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> to(Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default BuyingSession_C_1 to(BuyingSession_C_1 cast) {
		return (BuyingSession_C_1) this;
	}
}
