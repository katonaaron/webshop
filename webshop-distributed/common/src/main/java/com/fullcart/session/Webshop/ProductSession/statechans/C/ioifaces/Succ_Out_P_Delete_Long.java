package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

public interface Succ_Out_P_Delete_Long {

	default Branch_C_P_NotFound__P_Ok<?, ?> to(Branch_C_P_NotFound__P_Ok<?, ?> cast) {
		return (Branch_C_P_NotFound__P_Ok<?, ?>) this;
	}
}