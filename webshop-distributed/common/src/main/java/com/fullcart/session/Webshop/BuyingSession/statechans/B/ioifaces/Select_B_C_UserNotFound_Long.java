package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_10;

public interface Select_B_C_UserNotFound_Long<__Succ1 extends Succ_Out_C_UserNotFound_Long> extends Out_C_UserNotFound_Long<__Succ1>, Succ_In_U_NotFound_Long {
	Select_B_C_UserNotFound_Long<?> cast = null;

	@Override
	default Select_B_C_UserNotFound_Long<?> to(Select_B_C_UserNotFound_Long<?> cast) {
		return this;
	}

	default BuyingSession_B_10 to(BuyingSession_B_10 cast) {
		return (BuyingSession_B_10) this;
	}
}
