package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.GetOne;

public interface Callback_C_GetOne_Long<__Succ extends Succ_In_C_GetOne_Long> {

	void receive(__Succ schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
