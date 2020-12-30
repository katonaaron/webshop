package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.P.EndSocket;

public interface Succ_In_B_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}