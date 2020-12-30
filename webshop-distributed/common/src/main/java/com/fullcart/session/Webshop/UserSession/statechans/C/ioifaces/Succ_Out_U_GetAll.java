package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

public interface Succ_Out_U_GetAll {

	default Receive_C_U_Ok_List<?> to(Receive_C_U_Ok_List<?> cast) {
		return (Receive_C_U_Ok_List<?>) this;
	}
}