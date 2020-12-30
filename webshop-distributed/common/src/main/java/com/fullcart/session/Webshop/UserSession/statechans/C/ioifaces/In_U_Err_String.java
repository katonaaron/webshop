package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Err;
import com.fullcart.session.Webshop.UserSession.roles.U;

public interface In_U_Err_String<__Succ extends Succ_In_U_Err_String> {

	__Succ receive(U role, Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
