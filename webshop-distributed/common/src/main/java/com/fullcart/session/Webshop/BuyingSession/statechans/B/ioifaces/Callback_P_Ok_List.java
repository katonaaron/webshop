package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;

public interface Callback_P_Ok_List<__Succ extends Succ_In_P_Ok_List> {

	void receive(__Succ schan, Ok op, org.scribble.runtime.util.Buf<java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
