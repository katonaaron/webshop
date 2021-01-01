package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.BuyingSession_U_1;

public interface Branch_U_B_Bye__B_GetOne_Long<__Succ1 extends Succ_In_B_Bye, __Succ2 extends Succ_In_B_GetOne_Long> extends Succ_Out_B_Ok_User, Succ_Out_B_NotFound_Long {
	Branch_U_B_Bye__B_GetOne_Long<?, ?> cast = null;

	Case_U_B_Bye__B_GetOne_Long<__Succ1, __Succ2> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(B role, Handle_U_B_Bye__B_GetOne_Long<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(B role, Handle_U_B_Bye__B_GetOne_Long<Succ_In_B_Bye, Succ_In_B_GetOne_Long> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_U_B_Bye__B_GetOne_Long<?, ?> to(Branch_U_B_Bye__B_GetOne_Long<?, ?> cast) {
		return this;
	}

	default BuyingSession_U_1 to(BuyingSession_U_1 cast) {
		return (BuyingSession_U_1) this;
	}

enum Branch_U_B_Bye__B_GetOne_Long_Enum implements org.scribble.runtime.session.OpEnum {
	GetOne, Bye
}
}
