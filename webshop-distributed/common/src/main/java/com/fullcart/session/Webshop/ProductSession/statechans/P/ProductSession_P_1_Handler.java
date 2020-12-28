package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.ops.GetOne;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Handle_P_C_Bye__C_Create_Product__C_GetOne_Long;

public interface ProductSession_P_1_Handler extends Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<ProductSession_P_4, ProductSession_P_3, ProductSession_P_2> {

	@Override
    void receive(ProductSession_P_2 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_3 schan, Create op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_4 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
