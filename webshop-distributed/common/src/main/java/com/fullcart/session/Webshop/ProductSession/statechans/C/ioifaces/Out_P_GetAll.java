package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.GetAll;
import com.fullcart.session.Webshop.ProductSession.roles.P;

import java.io.IOException;

public interface Out_P_GetAll<__Succ extends Succ_Out_P_GetAll> {

	__Succ send(P role, GetAll op) throws org.scribble.main.ScribRuntimeException, IOException;
}
