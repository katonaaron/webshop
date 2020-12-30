package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Update;
import com.fullcart.session.Webshop.ProductSession.roles.C;

public interface In_C_Update_Long_Product<__Succ extends Succ_In_C_Update_Long_Product> {

	__Succ receive(C role, Update op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
