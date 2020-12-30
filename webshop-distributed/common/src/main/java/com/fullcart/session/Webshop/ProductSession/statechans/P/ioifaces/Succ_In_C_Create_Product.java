package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

public interface Succ_In_C_Create_Product {

	default Select_P_C_Err_String__C_Ok_Product<?, ?> to(Select_P_C_Err_String__C_Ok_Product<?, ?> cast) {
		return (Select_P_C_Err_String__C_Ok_Product<?, ?>) this;
	}
}