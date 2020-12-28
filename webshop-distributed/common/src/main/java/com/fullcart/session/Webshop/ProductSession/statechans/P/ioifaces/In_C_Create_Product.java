package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.roles.C;

public interface In_C_Create_Product<__Succ extends Succ_In_C_Create_Product> {

	__Succ receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
