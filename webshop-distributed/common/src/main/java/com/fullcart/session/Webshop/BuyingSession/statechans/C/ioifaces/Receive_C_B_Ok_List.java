package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_2;

public interface Receive_C_B_Ok_List<__Succ1 extends Succ_In_B_Ok_List> extends In_B_Ok_List<__Succ1>, Succ_Out_B_GetAll {
	Receive_C_B_Ok_List<?> cast = null;

	__Succ1 async(B role, Ok op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_C_B_Ok_List<?> to(Receive_C_B_Ok_List<?> cast) {
		return this;
	}

	default BuyingSession_C_2 to(BuyingSession_C_2 cast) {
		return (BuyingSession_C_2) this;
	}
}
