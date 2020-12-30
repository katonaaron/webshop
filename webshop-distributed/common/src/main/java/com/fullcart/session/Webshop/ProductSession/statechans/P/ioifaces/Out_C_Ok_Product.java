package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.roles.C;

import java.io.IOException;

public interface Out_C_Ok_Product<__Succ extends Succ_Out_C_Ok_Product> {

	__Succ send(C role, Ok op, com.fullcart.dto.ProductDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
