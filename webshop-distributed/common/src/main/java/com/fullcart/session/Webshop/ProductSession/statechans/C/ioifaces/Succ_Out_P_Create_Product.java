package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

public interface Succ_Out_P_Create_Product {

	default Receive_C_P_One_Product<?> to(Receive_C_P_One_Product<?> cast) {
		return (Receive_C_P_One_Product<?>) this;
	}
}