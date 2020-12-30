package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Created;

public interface Callback_P_Created_Product<__Succ extends Succ_In_P_Created_Product> {

	void receive(__Succ schan, Created op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
