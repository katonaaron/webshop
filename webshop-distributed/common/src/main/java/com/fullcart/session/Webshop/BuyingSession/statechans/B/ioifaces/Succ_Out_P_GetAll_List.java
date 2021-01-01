package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

public interface Succ_Out_P_GetAll_List {

	default Branch_B_P_NotFound_Long__P_Ok_List<?, ?> to(Branch_B_P_NotFound_Long__P_Ok_List<?, ?> cast) {
		return (Branch_B_P_NotFound_Long__P_Ok_List<?, ?>) this;
	}
}