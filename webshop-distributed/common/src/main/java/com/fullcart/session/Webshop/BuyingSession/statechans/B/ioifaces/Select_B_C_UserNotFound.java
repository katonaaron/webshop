package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_10;

public interface Select_B_C_UserNotFound<__Succ1 extends Succ_Out_C_UserNotFound> extends Out_C_UserNotFound<__Succ1>, Succ_In_U_NotFound {
	Select_B_C_UserNotFound<?> cast = null;

	@Override
	default Select_B_C_UserNotFound<?> to(Select_B_C_UserNotFound<?> cast) {
		return this;
	}

	default BuyingSession_B_10 to(BuyingSession_B_10 cast) {
		return (BuyingSession_B_10) this;
	}
}
