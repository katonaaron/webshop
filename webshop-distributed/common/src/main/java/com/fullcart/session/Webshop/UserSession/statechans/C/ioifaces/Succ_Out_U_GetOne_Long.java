package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

public interface Succ_Out_U_GetOne_Long {

	default Branch_C_U_NotFound__U_Ok_User<?, ?> to(Branch_C_U_NotFound__U_Ok_User<?, ?> cast) {
		return (Branch_C_U_NotFound__U_Ok_User<?, ?>) this;
	}
}