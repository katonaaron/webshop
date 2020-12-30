package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

public interface Succ_In_P_NotFound {

	default Select_B_C_ProductNotFound<?> to(Select_B_C_ProductNotFound<?> cast) {
		return (Select_B_C_ProductNotFound<?>) this;
	}
}