package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_5;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_6;

public interface Branch_C_B_NotAllowed__B_Ok_Order<__Succ1 extends Succ_In_B_NotAllowed, __Succ2 extends Succ_In_B_Ok_Order> extends Succ_Out_B_Cancel_Long_Order, Succ_Out_B_Complete_Long_Order {
	Branch_C_B_NotAllowed__B_Ok_Order<?, ?> cast = null;

	Case_C_B_NotAllowed__B_Ok_Order<__Succ1, __Succ2> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(B role, Handle_C_B_NotAllowed__B_Ok_Order<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(B role, Handle_C_B_NotAllowed__B_Ok_Order<Succ_In_B_NotAllowed, Succ_In_B_Ok_Order> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_B_NotAllowed__B_Ok_Order<?, ?> to(Branch_C_B_NotAllowed__B_Ok_Order<?, ?> cast) {
		return this;
	}

	default BuyingSession_C_5 to(BuyingSession_C_5 cast) {
		return (BuyingSession_C_5) this;
	}

	default BuyingSession_C_6 to(BuyingSession_C_6 cast) {
		return (BuyingSession_C_6) this;
	}

enum Branch_C_B_NotAllowed__B_Ok_Order_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, NotAllowed
}
}
