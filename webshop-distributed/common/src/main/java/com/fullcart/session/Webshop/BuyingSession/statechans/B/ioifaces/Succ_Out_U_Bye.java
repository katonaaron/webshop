package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.EndSocket;

public interface Succ_Out_U_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}