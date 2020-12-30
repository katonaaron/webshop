package com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetOne;

public interface Handle_U_B_Bye__B_GetOne_Long<__Succ1 extends Succ_In_B_Bye, __Succ2 extends Succ_In_B_GetOne_Long> extends Callback_B_Bye<__Succ1>, Callback_B_GetOne_Long<__Succ2> {

	void receive(__Succ1 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
