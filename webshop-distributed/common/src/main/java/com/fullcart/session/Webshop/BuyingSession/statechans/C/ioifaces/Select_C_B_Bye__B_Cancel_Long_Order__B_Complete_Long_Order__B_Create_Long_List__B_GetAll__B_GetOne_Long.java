package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_1;

public interface Select_C_B_Bye__B_Cancel_Long_Order__B_Complete_Long_Order__B_Create_Long_List__B_GetAll__B_GetOne_Long<__Succ1 extends Succ_Out_B_Bye, __Succ2 extends Succ_Out_B_Cancel_Long_Order, __Succ3 extends Succ_Out_B_Complete_Long_Order, __Succ4 extends Succ_Out_B_Create_Long_List, __Succ5 extends Succ_Out_B_GetAll, __Succ6 extends Succ_Out_B_GetOne_Long> extends Out_B_Bye<__Succ1>, Out_B_Cancel_Long_Order<__Succ2>, Out_B_Complete_Long_Order<__Succ3>, Out_B_Create_Long_List<__Succ4>, Out_B_GetAll<__Succ5>, Out_B_GetOne_Long<__Succ6>, Succ_In_B_All_List, Succ_In_B_UserNotFound, Succ_In_B_NotAllowed, Succ_In_B_NotFound, Succ_In_B_ProductNotFound, Succ_In_B_Ok_Order {
	Select_C_B_Bye__B_Cancel_Long_Order__B_Complete_Long_Order__B_Create_Long_List__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> cast = null;

	@Override
	default Select_C_B_Bye__B_Cancel_Long_Order__B_Complete_Long_Order__B_Create_Long_List__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> to(Select_C_B_Bye__B_Cancel_Long_Order__B_Complete_Long_Order__B_Create_Long_List__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default BuyingSession_C_1 to(BuyingSession_C_1 cast) {
		return (BuyingSession_C_1) this;
	}
}
