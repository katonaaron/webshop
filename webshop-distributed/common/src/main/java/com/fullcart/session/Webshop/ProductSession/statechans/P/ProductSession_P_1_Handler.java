package com.fullcart.session.Webshop.ProductSession.statechans.P;

import com.fullcart.session.Webshop.ProductSession.ops.*;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces.Handle_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product;

public interface ProductSession_P_1_Handler extends Handle_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<EndSocket, ProductSession_P_4, ProductSession_P_7, ProductSession_P_2, ProductSession_P_3, ProductSession_P_6, ProductSession_P_5> {

	@Override
    void receive(ProductSession_P_2 schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_3 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_4 schan, Create op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_5 schan, Update op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_6 schan, Replace op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(ProductSession_P_7 schan, Delete op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
    void receive(EndSocket schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
