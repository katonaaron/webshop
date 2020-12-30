package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.*;

public interface Handle_B_C_Bye__C_Cancel_Long_Order__C_Complete_Long_Order__C_Create_Long_List__C_GetAll__C_GetOne_Long<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Cancel_Long_Order, __Succ3 extends Succ_In_C_Complete_Long_Order, __Succ4 extends Succ_In_C_Create_Long_List, __Succ5 extends Succ_In_C_GetAll, __Succ6 extends Succ_In_C_GetOne_Long> extends Callback_C_Bye<__Succ1>, Callback_C_Cancel_Long_Order<__Succ2>, Callback_C_Complete_Long_Order<__Succ3>, Callback_C_Create_Long_List<__Succ4>, Callback_C_GetAll<__Succ5>, Callback_C_GetOne_Long<__Succ6> {

	void receive(__Succ1 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, Cancel op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ3 schan, Complete op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ4 schan, Create op, org.scribble.runtime.util.Buf<java.lang.Long> arg1, org.scribble.runtime.util.Buf<java.lang.Iterable> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ5 schan, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ6 schan, GetOne op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
