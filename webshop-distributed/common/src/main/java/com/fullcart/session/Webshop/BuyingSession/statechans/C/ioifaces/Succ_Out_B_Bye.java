package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.C.EndSocket;

public interface Succ_Out_B_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}