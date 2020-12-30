package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.UserSession_C_2;

public interface Receive_C_U_Ok_List<__Succ1 extends Succ_In_U_Ok_List> extends In_U_Ok_List<__Succ1>, Succ_Out_U_GetAll {
	Receive_C_U_Ok_List<?> cast = null;

	__Succ1 async(U role, Ok op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_C_U_Ok_List<?> to(Receive_C_U_Ok_List<?> cast) {
		return this;
	}

	default UserSession_C_2 to(UserSession_C_2 cast) {
		return (UserSession_C_2) this;
	}
}
