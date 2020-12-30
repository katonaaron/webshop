package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

public interface Succ_Out_U_Delete_Long {

	default Branch_C_U_NotFound__U_Ok<?, ?> to(Branch_C_U_NotFound__U_Ok<?, ?> cast) {
		return (Branch_C_U_NotFound__U_Ok<?, ?>) this;
	}
}