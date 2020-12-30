package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_4;

public interface Select_B_U_GetOne_Long<__Succ1 extends Succ_Out_U_GetOne_Long> extends Out_U_GetOne_Long<__Succ1>, Succ_In_C_Create_Long_List {
	Select_B_U_GetOne_Long<?> cast = null;

	@Override
	default Select_B_U_GetOne_Long<?> to(Select_B_U_GetOne_Long<?> cast) {
		return this;
	}

	default BuyingSession_B_4 to(BuyingSession_B_4 cast) {
		return (BuyingSession_B_4) this;
	}
}
