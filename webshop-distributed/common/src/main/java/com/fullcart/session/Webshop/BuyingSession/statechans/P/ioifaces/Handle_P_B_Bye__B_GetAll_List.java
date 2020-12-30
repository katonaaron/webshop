package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;

public interface Handle_P_B_Bye__B_GetAll_List<__Succ1 extends Succ_In_B_Bye, __Succ2 extends Succ_In_B_GetAll_List> extends Callback_B_Bye<__Succ1>, Callback_B_GetAll_List<__Succ2> {

	void receive(__Succ1 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, GetAll op, org.scribble.runtime.util.Buf<java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
