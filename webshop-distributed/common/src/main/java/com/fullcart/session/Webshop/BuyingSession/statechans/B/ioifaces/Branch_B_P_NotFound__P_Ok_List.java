package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_7;

public interface Branch_B_P_NotFound__P_Ok_List<__Succ1 extends Succ_In_P_NotFound, __Succ2 extends Succ_In_P_Ok_List> extends Succ_Out_P_GetAll_List {
	Branch_B_P_NotFound__P_Ok_List<?, ?> cast = null;

	Case_B_P_NotFound__P_Ok_List<__Succ1, __Succ2> branch(P role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(P role, Handle_B_P_NotFound__P_Ok_List<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(P role, Handle_B_P_NotFound__P_Ok_List<Succ_In_P_NotFound, Succ_In_P_Ok_List> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_B_P_NotFound__P_Ok_List<?, ?> to(Branch_B_P_NotFound__P_Ok_List<?, ?> cast) {
		return this;
	}

	default BuyingSession_B_7 to(BuyingSession_B_7 cast) {
		return (BuyingSession_B_7) this;
	}

enum Branch_B_P_NotFound__P_Ok_List_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, NotFound
}
}
