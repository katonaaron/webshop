package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_7;

public interface Select_U_C_NotFound__C_Ok<__Succ1 extends Succ_Out_C_NotFound, __Succ2 extends Succ_Out_C_Ok> extends Out_C_NotFound<__Succ1>, Out_C_Ok<__Succ2>, Succ_In_C_Delete_Long {
	Select_U_C_NotFound__C_Ok<?, ?> cast = null;

	@Override
	default Select_U_C_NotFound__C_Ok<?, ?> to(Select_U_C_NotFound__C_Ok<?, ?> cast) {
		return this;
	}

	default UserSession_U_7 to(UserSession_U_7 cast) {
		return (UserSession_U_7) this;
	}
}
