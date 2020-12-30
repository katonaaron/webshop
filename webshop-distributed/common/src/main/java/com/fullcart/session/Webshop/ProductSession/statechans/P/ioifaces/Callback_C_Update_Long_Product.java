package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Update;

public interface Callback_C_Update_Long_Product<__Succ extends Succ_In_C_Update_Long_Product> {

	void receive(__Succ schan, Update op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
