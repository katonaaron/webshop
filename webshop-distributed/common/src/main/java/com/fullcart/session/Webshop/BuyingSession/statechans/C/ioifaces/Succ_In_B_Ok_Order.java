package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_In_B_Ok_Order {

	default Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> to(Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?> cast) {
		return (Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<?, ?, ?, ?, ?, ?>) this;
	}
}