package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

public interface Succ_Out_B_Complete_Long_Order {

	default Branch_C_B_NotAllowed__B_Ok_Order<?, ?> to(Branch_C_B_NotAllowed__B_Ok_Order<?, ?> cast) {
		return (Branch_C_B_NotAllowed__B_Ok_Order<?, ?>) this;
	}
}