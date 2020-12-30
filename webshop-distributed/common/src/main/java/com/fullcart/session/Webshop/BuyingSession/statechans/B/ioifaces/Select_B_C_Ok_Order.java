package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_8;

public interface Select_B_C_Ok_Order<__Succ1 extends Succ_Out_C_Ok_Order> extends Out_C_Ok_Order<__Succ1>, Succ_In_P_Ok_List {
	Select_B_C_Ok_Order<?> cast = null;

	@Override
	default Select_B_C_Ok_Order<?> to(Select_B_C_Ok_Order<?> cast) {
		return this;
	}

	default BuyingSession_B_8 to(BuyingSession_B_8 cast) {
		return (BuyingSession_B_8) this;
	}
}
