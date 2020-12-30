package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Err;
import com.fullcart.session.Webshop.ProductSession.roles.P;

public interface In_P_Err_String<__Succ extends Succ_In_P_Err_String> {

	__Succ receive(P role, Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
