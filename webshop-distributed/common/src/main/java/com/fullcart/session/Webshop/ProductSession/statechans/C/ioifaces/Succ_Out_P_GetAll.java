package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

public interface Succ_Out_P_GetAll {

	default Receive_C_P_Ok_List<?> to(Receive_C_P_Ok_List<?> cast) {
		return (Receive_C_P_Ok_List<?>) this;
	}
}