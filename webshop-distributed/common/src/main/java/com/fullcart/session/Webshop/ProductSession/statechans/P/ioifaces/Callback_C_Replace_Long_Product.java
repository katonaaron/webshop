package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Replace;

public interface Callback_C_Replace_Long_Product<__Succ extends Succ_In_C_Replace_Long_Product> {

	void receive(__Succ schan, Replace op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
