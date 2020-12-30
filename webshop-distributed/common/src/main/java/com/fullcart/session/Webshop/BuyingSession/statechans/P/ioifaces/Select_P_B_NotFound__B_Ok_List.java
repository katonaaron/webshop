package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.P.BuyingSession_P_2;

public interface Select_P_B_NotFound__B_Ok_List<__Succ1 extends Succ_Out_B_NotFound, __Succ2 extends Succ_Out_B_Ok_List> extends Out_B_NotFound<__Succ1>, Out_B_Ok_List<__Succ2>, Succ_In_B_GetAll_List {
	Select_P_B_NotFound__B_Ok_List<?, ?> cast = null;

	@Override
	default Select_P_B_NotFound__B_Ok_List<?, ?> to(Select_P_B_NotFound__B_Ok_List<?, ?> cast) {
		return this;
	}

	default BuyingSession_P_2 to(BuyingSession_P_2 cast) {
		return (BuyingSession_P_2) this;
	}
}
