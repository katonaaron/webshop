package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Err;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_Err_String<__Succ extends Succ_In_B_Err_String> {

	__Succ receive(B role, Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
