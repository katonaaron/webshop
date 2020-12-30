package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.ops.*;

public interface Handle_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_Product, __Succ3 extends Succ_In_C_Delete_Long, __Succ4 extends Succ_In_C_GetAll, __Succ5 extends Succ_In_C_GetOne_Long, __Succ6 extends Succ_In_C_Replace_Long_Product, __Succ7 extends Succ_In_C_Update_Long_Product> extends Callback_C_Bye<__Succ1>, Callback_C_Create_Product<__Succ2>, Callback_C_Delete_Long<__Succ3>, Callback_C_GetAll<__Succ4>, Callback_C_GetOne_Long<__Succ5>, Callback_C_Replace_Long_Product<__Succ6>, Callback_C_Update_Long_Product<__Succ7> {

	void receive(__Succ1 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, Create op, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ3 schan, Delete op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ4 schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ5 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ6 schan, Replace op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ7 schan, Update op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.ProductDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
