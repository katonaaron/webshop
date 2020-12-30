package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.C.EndSocket;

public interface Succ_Out_U_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}