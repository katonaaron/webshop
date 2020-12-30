package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Err;

public interface Callback_U_Err_String<__Succ extends Succ_In_U_Err_String> {

	void receive(__Succ schan, Err op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
