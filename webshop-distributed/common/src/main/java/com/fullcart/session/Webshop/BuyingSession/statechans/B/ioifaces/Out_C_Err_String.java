package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Err;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_Err_String<__Succ extends Succ_Out_C_Err_String> {

	__Succ send(C role, Err op, java.lang.String arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
