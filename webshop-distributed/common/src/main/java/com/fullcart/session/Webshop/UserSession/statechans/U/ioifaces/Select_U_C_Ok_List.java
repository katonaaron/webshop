package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_2;

public interface Select_U_C_Ok_List<__Succ1 extends Succ_Out_C_Ok_List> extends Out_C_Ok_List<__Succ1>, Succ_In_C_GetAll {
	Select_U_C_Ok_List<?> cast = null;

	@Override
	default Select_U_C_Ok_List<?> to(Select_U_C_Ok_List<?> cast) {
		return this;
	}

	default UserSession_U_2 to(UserSession_U_2 cast) {
		return (UserSession_U_2) this;
	}
}
