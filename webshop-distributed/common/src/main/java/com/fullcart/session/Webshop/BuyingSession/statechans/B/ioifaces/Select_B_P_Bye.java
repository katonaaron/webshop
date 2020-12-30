package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_13;

public interface Select_B_P_Bye<__Succ1 extends Succ_Out_P_Bye> extends Out_P_Bye<__Succ1>, Succ_In_C_Bye {
	Select_B_P_Bye<?> cast = null;

	@Override
	default Select_B_P_Bye<?> to(Select_B_P_Bye<?> cast) {
		return this;
	}

	default BuyingSession_B_13 to(BuyingSession_B_13 cast) {
		return (BuyingSession_B_13) this;
	}
}
