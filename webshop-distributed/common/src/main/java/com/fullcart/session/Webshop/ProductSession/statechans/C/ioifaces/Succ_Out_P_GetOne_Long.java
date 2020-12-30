package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

public interface Succ_Out_P_GetOne_Long {

	default Branch_C_P_NotFound__P_Ok_Product<?, ?> to(Branch_C_P_NotFound__P_Ok_Product<?, ?> cast) {
		return (Branch_C_P_NotFound__P_Ok_Product<?, ?>) this;
	}
}