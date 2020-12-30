package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_3;

public interface Select_B_C_NotFound__C_Ok_Order<__Succ1 extends Succ_Out_C_NotFound, __Succ2 extends Succ_Out_C_Ok_Order> extends Out_C_NotFound<__Succ1>, Out_C_Ok_Order<__Succ2>, Succ_In_C_GetOne_Long {
	Select_B_C_NotFound__C_Ok_Order<?, ?> cast = null;

	@Override
	default Select_B_C_NotFound__C_Ok_Order<?, ?> to(Select_B_C_NotFound__C_Ok_Order<?, ?> cast) {
		return this;
	}

	default BuyingSession_B_3 to(BuyingSession_B_3 cast) {
		return (BuyingSession_B_3) this;
	}
}
