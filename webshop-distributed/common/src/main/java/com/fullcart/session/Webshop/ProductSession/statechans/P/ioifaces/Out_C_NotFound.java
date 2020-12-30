package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.roles.C;

import java.io.IOException;

public interface Out_C_NotFound<__Succ extends Succ_Out_C_NotFound> {

	__Succ send(C role, NotFound op) throws org.scribble.main.ScribRuntimeException, IOException;
}
