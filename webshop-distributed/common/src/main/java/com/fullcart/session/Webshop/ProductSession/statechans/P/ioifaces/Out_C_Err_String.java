package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Err;
import com.fullcart.session.Webshop.ProductSession.roles.C;

import java.io.IOException;

public interface Out_C_Err_String<__Succ extends Succ_Out_C_Err_String> {

	__Succ send(C role, Err op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
