package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Replace;
import com.fullcart.session.Webshop.ProductSession.roles.P;

import java.io.IOException;

public interface Out_P_Replace_Long_Product<__Succ extends Succ_Out_P_Replace_Long_Product> {

	__Succ send(P role, Replace op, java.lang.Long arg0, com.fullcart.dto.ProductDTO arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}
