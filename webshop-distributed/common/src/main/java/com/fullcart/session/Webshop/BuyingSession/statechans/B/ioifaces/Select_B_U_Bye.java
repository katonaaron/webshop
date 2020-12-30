package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_14;

public interface Select_B_U_Bye<__Succ1 extends Succ_Out_U_Bye> extends Out_U_Bye<__Succ1>, Succ_Out_P_Bye {
	Select_B_U_Bye<?> cast = null;

	@Override
	default Select_B_U_Bye<?> to(Select_B_U_Bye<?> cast) {
		return this;
	}

	default BuyingSession_B_14 to(BuyingSession_B_14 cast) {
		return (BuyingSession_B_14) this;
	}
}
