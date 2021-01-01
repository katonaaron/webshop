package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_2;

public interface Select_B_C_Ok_List<__Succ1 extends Succ_Out_C_Ok_List> extends Out_C_Ok_List<__Succ1>, Succ_In_C_GetAll {
	Select_B_C_Ok_List<?> cast = null;

	@Override
	default Select_B_C_Ok_List<?> to(Select_B_C_Ok_List<?> cast) {
		return this;
	}

	default BuyingSession_B_2 to(BuyingSession_B_2 cast) {
		return (BuyingSession_B_2) this;
	}
}
