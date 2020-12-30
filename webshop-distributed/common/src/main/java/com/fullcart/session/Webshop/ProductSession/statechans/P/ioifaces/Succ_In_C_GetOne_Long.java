package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

public interface Succ_In_C_GetOne_Long {

	default Select_P_C_NotFound__C_Ok_Product<?, ?> to(Select_P_C_NotFound__C_Ok_Product<?, ?> cast) {
		return (Select_P_C_NotFound__C_Ok_Product<?, ?>) this;
	}
}