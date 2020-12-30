package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_11;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_12;

public interface Select_B_C_NotAllowed__C_Ok_Order<__Succ1 extends Succ_Out_C_NotAllowed, __Succ2 extends Succ_Out_C_Ok_Order> extends Out_C_NotAllowed<__Succ1>, Out_C_Ok_Order<__Succ2>, Succ_In_C_Cancel_Long_Order, Succ_In_C_Complete_Long_Order {
	Select_B_C_NotAllowed__C_Ok_Order<?, ?> cast = null;

	@Override
	default Select_B_C_NotAllowed__C_Ok_Order<?, ?> to(Select_B_C_NotAllowed__C_Ok_Order<?, ?> cast) {
		return this;
	}

	default BuyingSession_B_11 to(BuyingSession_B_11 cast) {
		return (BuyingSession_B_11) this;
	}

	default BuyingSession_B_12 to(BuyingSession_B_12 cast) {
		return (BuyingSession_B_12) this;
	}
}
