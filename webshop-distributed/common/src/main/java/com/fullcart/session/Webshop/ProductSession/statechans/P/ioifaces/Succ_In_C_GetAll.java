package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

public interface Succ_In_C_GetAll {

	default Select_P_C_Ok_List<?> to(Select_P_C_Ok_List<?> cast) {
		return (Select_P_C_Ok_List<?>) this;
	}
}