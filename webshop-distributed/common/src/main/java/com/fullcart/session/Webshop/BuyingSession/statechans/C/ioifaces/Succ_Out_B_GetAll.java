package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_Out_B_GetAll {

	default Receive_C_B_All_List<?> to(Receive_C_B_All_List<?> cast) {
		return (Receive_C_B_All_List<?>) this;
	}
}