package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_4;

public interface Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<__Succ1 extends Succ_In_B_Ok_Order, __Succ2 extends Succ_In_B_ProductNotFound, __Succ3 extends Succ_In_B_UserNotFound> extends Succ_Out_B_Create_Long_List {
	Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?> cast = null;

	Case_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<__Succ1, __Succ2, __Succ3> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(B role, Handle_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<__Succ1, __Succ2, __Succ3> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(B role, Handle_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<Succ_In_B_Ok_Order, Succ_In_B_ProductNotFound, Succ_In_B_UserNotFound> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?> to(Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?> cast) {
		return this;
	}

	default BuyingSession_C_4 to(BuyingSession_C_4 cast) {
		return (BuyingSession_C_4) this;
	}

enum Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, ProductNotFound, UserNotFound
}
}
