package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

public interface Succ_In_P_Ok_List {

	default Select_B_C_Ok_Order<?> to(Select_B_C_Ok_Order<?> cast) {
		return (Select_B_C_Ok_Order<?>) this;
	}
}