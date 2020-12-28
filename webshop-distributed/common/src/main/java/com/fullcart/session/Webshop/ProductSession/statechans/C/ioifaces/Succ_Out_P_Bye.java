package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

public interface Succ_Out_P_Bye {

	default Receive_C_P_Bye<?> to(Receive_C_P_Bye<?> cast) {
		return (Receive_C_P_Bye<?>) this;
	}
}