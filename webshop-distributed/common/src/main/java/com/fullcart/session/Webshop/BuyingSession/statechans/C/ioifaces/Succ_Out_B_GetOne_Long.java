package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_Out_B_GetOne_Long {

	default Branch_C_B_NotFound__B_Ok_Order<?, ?> to(Branch_C_B_NotFound__B_Ok_Order<?, ?> cast) {
		return (Branch_C_B_NotFound__B_Ok_Order<?, ?>) this;
	}
}