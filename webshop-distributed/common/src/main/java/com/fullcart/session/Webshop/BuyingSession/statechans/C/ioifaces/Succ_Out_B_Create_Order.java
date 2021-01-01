package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_Out_B_Create_Order {

	default Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?> to(Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?> cast) {
		return (Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?>) this;
	}
}