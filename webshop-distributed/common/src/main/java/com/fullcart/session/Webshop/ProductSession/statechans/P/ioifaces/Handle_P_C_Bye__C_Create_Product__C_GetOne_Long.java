package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.ops.GetOne;

public interface Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_Product, __Succ3 extends Succ_In_C_GetOne_Long> extends Callback_C_Bye<__Succ1>, Callback_C_Create_Product<__Succ2>, Callback_C_GetOne_Long<__Succ3> {

	void receive(__Succ1 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, Create op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ3 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
