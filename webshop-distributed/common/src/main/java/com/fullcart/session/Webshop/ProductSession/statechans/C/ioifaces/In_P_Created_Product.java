package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Created;
import com.fullcart.session.Webshop.ProductSession.roles.P;

public interface In_P_Created_Product<__Succ extends Succ_In_P_Created_Product> {

	__Succ receive(P role, Created op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
