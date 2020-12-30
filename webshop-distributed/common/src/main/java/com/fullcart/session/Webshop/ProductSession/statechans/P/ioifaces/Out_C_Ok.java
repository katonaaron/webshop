package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.C;

import java.io.IOException;

public interface Out_C_Ok<__Succ extends Succ_Out_C_Ok> {

	__Succ send(C role, Ok op) throws org.scribble.main.ScribRuntimeException, IOException;
}
