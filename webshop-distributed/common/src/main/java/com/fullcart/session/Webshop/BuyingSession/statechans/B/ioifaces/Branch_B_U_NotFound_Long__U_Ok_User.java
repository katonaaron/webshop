package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_5;

public interface Branch_B_U_NotFound_Long__U_Ok_User<__Succ1 extends Succ_In_U_NotFound_Long, __Succ2 extends Succ_In_U_Ok_User> extends Succ_Out_U_GetOne_Long {
	Branch_B_U_NotFound_Long__U_Ok_User<?, ?> cast = null;

	Case_B_U_NotFound_Long__U_Ok_User<__Succ1, __Succ2> branch(U role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(U role, Handle_B_U_NotFound_Long__U_Ok_User<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(U role, Handle_B_U_NotFound_Long__U_Ok_User<Succ_In_U_NotFound_Long, Succ_In_U_Ok_User> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_B_U_NotFound_Long__U_Ok_User<?, ?> to(Branch_B_U_NotFound_Long__U_Ok_User<?, ?> cast) {
		return this;
	}

	default BuyingSession_B_5 to(BuyingSession_B_5 cast) {
		return (BuyingSession_B_5) this;
	}

enum Branch_B_U_NotFound_Long__U_Ok_User_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, NotFound
}
}
