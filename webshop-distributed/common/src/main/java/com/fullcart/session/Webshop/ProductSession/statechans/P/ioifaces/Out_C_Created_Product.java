package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Created;
import com.fullcart.session.Webshop.ProductSession.roles.C;

import java.io.IOException;

public interface Out_C_Created_Product<__Succ extends Succ_Out_C_Created_Product> {

	__Succ send(C role, Created op, com.fullcart.dto.ProductDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
