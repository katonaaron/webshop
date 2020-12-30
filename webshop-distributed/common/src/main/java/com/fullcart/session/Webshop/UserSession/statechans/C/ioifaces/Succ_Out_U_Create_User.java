package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

public interface Succ_Out_U_Create_User {

	default Branch_C_U_Err_String__U_Ok_User<?, ?> to(Branch_C_U_Err_String__U_Ok_User<?, ?> cast) {
		return (Branch_C_U_Err_String__U_Ok_User<?, ?>) this;
	}
}