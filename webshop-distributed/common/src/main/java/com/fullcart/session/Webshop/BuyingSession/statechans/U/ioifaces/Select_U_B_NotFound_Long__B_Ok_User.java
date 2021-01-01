package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.U.BuyingSession_U_2;

public interface Select_U_B_NotFound_Long__B_Ok_User<__Succ1 extends Succ_Out_B_NotFound_Long, __Succ2 extends Succ_Out_B_Ok_User> extends Out_B_NotFound_Long<__Succ1>, Out_B_Ok_User<__Succ2>, Succ_In_B_GetOne_Long {
	Select_U_B_NotFound_Long__B_Ok_User<?, ?> cast = null;

	@Override
	default Select_U_B_NotFound_Long__B_Ok_User<?, ?> to(Select_U_B_NotFound_Long__B_Ok_User<?, ?> cast) {
		return this;
	}

	default BuyingSession_U_2 to(BuyingSession_U_2 cast) {
		return (BuyingSession_U_2) this;
	}
}
