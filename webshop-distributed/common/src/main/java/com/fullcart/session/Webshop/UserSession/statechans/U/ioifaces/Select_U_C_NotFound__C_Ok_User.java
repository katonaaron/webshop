package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_3;

public interface Select_U_C_NotFound__C_Ok_User<__Succ1 extends Succ_Out_C_NotFound, __Succ2 extends Succ_Out_C_Ok_User> extends Out_C_NotFound<__Succ1>, Out_C_Ok_User<__Succ2>, Succ_In_C_GetOne_Long {
	Select_U_C_NotFound__C_Ok_User<?, ?> cast = null;

	@Override
	default Select_U_C_NotFound__C_Ok_User<?, ?> to(Select_U_C_NotFound__C_Ok_User<?, ?> cast) {
		return this;
	}

	default UserSession_U_3 to(UserSession_U_3 cast) {
		return (UserSession_U_3) this;
	}
}
