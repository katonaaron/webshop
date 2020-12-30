package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.EndSocket;

public interface Succ_In_C_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}