package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

public interface Succ_In_C_GetOne_Long {

	default Select_B_C_NotFound__C_Ok_Order<?, ?> to(Select_B_C_NotFound__C_Ok_Order<?, ?> cast) {
		return (Select_B_C_NotFound__C_Ok_Order<?, ?>) this;
	}
}