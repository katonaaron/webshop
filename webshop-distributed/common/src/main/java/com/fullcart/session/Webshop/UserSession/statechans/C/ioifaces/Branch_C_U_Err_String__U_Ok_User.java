package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.UserSession_C_4;

public interface Branch_C_U_Err_String__U_Ok_User<__Succ1 extends Succ_In_U_Err_String, __Succ2 extends Succ_In_U_Ok_User> extends Succ_Out_U_Create_User {
	Branch_C_U_Err_String__U_Ok_User<?, ?> cast = null;

	Case_C_U_Err_String__U_Ok_User<__Succ1, __Succ2> branch(U role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(U role, Handle_C_U_Err_String__U_Ok_User<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(U role, Handle_C_U_Err_String__U_Ok_User<Succ_In_U_Err_String, Succ_In_U_Ok_User> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_U_Err_String__U_Ok_User<?, ?> to(Branch_C_U_Err_String__U_Ok_User<?, ?> cast) {
		return this;
	}

	default UserSession_C_4 to(UserSession_C_4 cast) {
		return (UserSession_C_4) this;
	}

enum Branch_C_U_Err_String__U_Ok_User_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, Err
}
}
