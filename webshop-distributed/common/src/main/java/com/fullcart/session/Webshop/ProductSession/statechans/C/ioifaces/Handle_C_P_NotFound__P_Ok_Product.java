package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;

public interface Handle_C_P_NotFound__P_Ok_Product<__Succ1 extends Succ_In_P_NotFound, __Succ2 extends Succ_In_P_Ok_Product> extends Callback_P_NotFound<__Succ1>, Callback_P_Ok_Product<__Succ2> {

	void receive(__Succ1 schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
