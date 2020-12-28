package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.C.EndSocket;

public interface Succ_In_P_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}