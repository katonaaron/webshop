package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.U.EndSocket;

public interface Succ_In_C_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}