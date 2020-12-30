package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Delete;
import com.fullcart.session.Webshop.ProductSession.roles.P;

import java.io.IOException;

public interface Out_P_Delete_Long<__Succ extends Succ_Out_P_Delete_Long> {

	__Succ send(P role, Delete op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
