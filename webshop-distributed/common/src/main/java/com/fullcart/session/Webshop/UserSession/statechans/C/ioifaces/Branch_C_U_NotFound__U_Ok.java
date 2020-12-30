package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.UserSession_C_7;

public interface Branch_C_U_NotFound__U_Ok<__Succ1 extends Succ_In_U_NotFound, __Succ2 extends Succ_In_U_Ok> extends Succ_Out_U_Delete_Long {
	Branch_C_U_NotFound__U_Ok<?, ?> cast = null;

	Case_C_U_NotFound__U_Ok<__Succ1, __Succ2> branch(U role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(U role, Handle_C_U_NotFound__U_Ok<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(U role, Handle_C_U_NotFound__U_Ok<Succ_In_U_NotFound, Succ_In_U_Ok> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_U_NotFound__U_Ok<?, ?> to(Branch_C_U_NotFound__U_Ok<?, ?> cast) {
		return this;
	}

	default UserSession_C_7 to(UserSession_C_7 cast) {
		return (UserSession_C_7) this;
	}

enum Branch_C_U_NotFound__U_Ok_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, NotFound
}
}
