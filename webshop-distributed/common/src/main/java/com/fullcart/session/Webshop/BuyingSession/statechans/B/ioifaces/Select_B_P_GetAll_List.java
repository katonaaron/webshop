package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_6;

public interface Select_B_P_GetAll_List<__Succ1 extends Succ_Out_P_GetAll_List> extends Out_P_GetAll_List<__Succ1>, Succ_In_U_Ok_User {
	Select_B_P_GetAll_List<?> cast = null;

	@Override
	default Select_B_P_GetAll_List<?> to(Select_B_P_GetAll_List<?> cast) {
		return this;
	}

	default BuyingSession_B_6 to(BuyingSession_B_6 cast) {
		return (BuyingSession_B_6) this;
	}
}
