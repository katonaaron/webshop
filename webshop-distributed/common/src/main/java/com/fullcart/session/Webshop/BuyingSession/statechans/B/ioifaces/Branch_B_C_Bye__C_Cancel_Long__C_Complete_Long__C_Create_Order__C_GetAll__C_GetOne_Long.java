package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.BuyingSession_B_1;

public interface Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Cancel_Long, __Succ3 extends Succ_In_C_Complete_Long, __Succ4 extends Succ_In_C_Create_Order, __Succ5 extends Succ_In_C_GetAll, __Succ6 extends Succ_In_C_GetOne_Long> extends Succ_Out_C_ProductNotFound_Long, Succ_Out_C_Err_String, Succ_Out_C_NotFound, Succ_Out_C_Ok_Order, Succ_Out_C_Ok_List, Succ_Out_C_NotAllowed, Succ_Out_C_UserNotFound_Long {
	Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<?, ?, ?, ?, ?, ?> cast = null;

	Case_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<__Succ1, __Succ2, __Succ3, __Succ4, __Succ5, __Succ6> branch(C role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(C role, Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<__Succ1, __Succ2, __Succ3, __Succ4, __Succ5, __Succ6> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(C role, Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<Succ_In_C_Bye, Succ_In_C_Cancel_Long, Succ_In_C_Complete_Long, Succ_In_C_Create_Order, Succ_In_C_GetAll, Succ_In_C_GetOne_Long> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<?, ?, ?, ?, ?, ?> to(Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default BuyingSession_B_1 to(BuyingSession_B_1 cast) {
		return (BuyingSession_B_1) this;
	}

enum Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum implements org.scribble.runtime.session.OpEnum {
	GetAll, GetOne, Create, Cancel, Complete, Bye
}
}
