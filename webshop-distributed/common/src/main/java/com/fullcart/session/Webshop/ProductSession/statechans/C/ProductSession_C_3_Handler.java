package com.fullcart.session.Webshop.ProductSession.statechans.C;

import com.fullcart.session.Webshop.ProductSession.ops.NotFound;
import com.fullcart.session.Webshop.ProductSession.ops.Ok;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces.Handle_C_P_NotFound__P_Ok_Product;

public interface ProductSession_C_3_Handler extends Handle_C_P_NotFound__P_Ok_Product<ProductSession_C_1, ProductSession_C_1> {

	@Override
    void receive(ProductSession_C_1 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_C_1 schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
