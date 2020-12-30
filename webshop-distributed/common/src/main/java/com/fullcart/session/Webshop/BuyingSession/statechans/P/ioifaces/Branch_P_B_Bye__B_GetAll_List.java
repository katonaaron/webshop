package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.BuyingSession_P_1;

public interface Branch_P_B_Bye__B_GetAll_List<__Succ1 extends Succ_In_B_Bye, __Succ2 extends Succ_In_B_GetAll_List> extends Succ_Out_B_Ok_List, Succ_Out_B_NotFound {
	Branch_P_B_Bye__B_GetAll_List<?, ?> cast = null;

	Case_P_B_Bye__B_GetAll_List<__Succ1, __Succ2> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(B role, Handle_P_B_Bye__B_GetAll_List<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(B role, Handle_P_B_Bye__B_GetAll_List<Succ_In_B_Bye, Succ_In_B_GetAll_List> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_P_B_Bye__B_GetAll_List<?, ?> to(Branch_P_B_Bye__B_GetAll_List<?, ?> cast) {
		return this;
	}

	default BuyingSession_P_1 to(BuyingSession_P_1 cast) {
		return (BuyingSession_P_1) this;
	}

enum Branch_P_B_Bye__B_GetAll_List_Enum implements org.scribble.runtime.session.OpEnum {
	GetAll, Bye
}
}
