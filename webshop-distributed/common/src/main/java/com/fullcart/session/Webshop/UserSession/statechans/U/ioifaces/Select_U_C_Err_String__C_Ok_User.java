package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_4;

public interface Select_U_C_Err_String__C_Ok_User<__Succ1 extends Succ_Out_C_Err_String, __Succ2 extends Succ_Out_C_Ok_User> extends Out_C_Err_String<__Succ1>, Out_C_Ok_User<__Succ2>, Succ_In_C_Create_User {
	Select_U_C_Err_String__C_Ok_User<?, ?> cast = null;

	@Override
	default Select_U_C_Err_String__C_Ok_User<?, ?> to(Select_U_C_Err_String__C_Ok_User<?, ?> cast) {
		return this;
	}

	default UserSession_U_4 to(UserSession_U_4 cast) {
		return (UserSession_U_4) this;
	}
}
