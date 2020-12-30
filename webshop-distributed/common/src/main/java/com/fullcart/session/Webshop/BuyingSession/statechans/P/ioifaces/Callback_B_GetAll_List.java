package com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;

public interface Callback_B_GetAll_List<__Succ extends Succ_In_B_GetAll_List> {

	void receive(__Succ schan, GetAll op, org.scribble.runtime.util.Buf<java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
