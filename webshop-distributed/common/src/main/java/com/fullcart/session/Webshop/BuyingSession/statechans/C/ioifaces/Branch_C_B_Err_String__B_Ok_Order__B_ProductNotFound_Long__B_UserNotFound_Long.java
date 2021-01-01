package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.BuyingSession_C_4;

public interface Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<__Succ1 extends Succ_In_B_Err_String, __Succ2 extends Succ_In_B_Ok_Order, __Succ3 extends Succ_In_B_ProductNotFound_Long, __Succ4 extends Succ_In_B_UserNotFound_Long> extends Succ_Out_B_Create_Order {
	Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?> cast = null;

	Case_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<__Succ1, __Succ2, __Succ3, __Succ4> branch(B role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(B role, Handle_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<__Succ1, __Succ2, __Succ3, __Succ4> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(B role, Handle_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<Succ_In_B_Err_String, Succ_In_B_Ok_Order, Succ_In_B_ProductNotFound_Long, Succ_In_B_UserNotFound_Long> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?> to(Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?> cast) {
		return this;
	}

	default BuyingSession_C_4 to(BuyingSession_C_4 cast) {
		return (BuyingSession_C_4) this;
	}

enum Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, ProductNotFound, UserNotFound, Err
}
}
