package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_Out_B_Create_Long_List {

	default Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?> to(Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?> cast) {
		return (Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?>) this;
	}
}