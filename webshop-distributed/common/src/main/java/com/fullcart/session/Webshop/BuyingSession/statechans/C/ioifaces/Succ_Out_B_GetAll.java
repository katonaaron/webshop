package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_Out_B_GetAll {

	default Receive_C_B_Ok_List<?> to(Receive_C_B_Ok_List<?> cast) {
		return (Receive_C_B_Ok_List<?>) this;
	}
}