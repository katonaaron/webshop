package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_9;

public interface Select_B_C_ProductNotFound<__Succ1 extends Succ_Out_C_ProductNotFound> extends Out_C_ProductNotFound<__Succ1>, Succ_In_P_NotFound {
	Select_B_C_ProductNotFound<?> cast = null;

	@Override
	default Select_B_C_ProductNotFound<?> to(Select_B_C_ProductNotFound<?> cast) {
		return this;
	}

	default BuyingSession_B_9 to(BuyingSession_B_9 cast) {
		return (BuyingSession_B_9) this;
	}
}
