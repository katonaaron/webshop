package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.statechans.P.EndSocket;

public interface Succ_Out_C_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}