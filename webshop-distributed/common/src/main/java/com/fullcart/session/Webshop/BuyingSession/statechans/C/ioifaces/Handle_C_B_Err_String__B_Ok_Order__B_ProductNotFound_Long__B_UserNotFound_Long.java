package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Err;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;

public interface Handle_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<__Succ1 extends Succ_In_B_Err_String, __Succ2 extends Succ_In_B_Ok_Order, __Succ3 extends Succ_In_B_ProductNotFound_Long, __Succ4 extends Succ_In_B_UserNotFound_Long> extends Callback_B_Err_String<__Succ1>, Callback_B_Ok_Order<__Succ2>, Callback_B_ProductNotFound_Long<__Succ3>, Callback_B_UserNotFound_Long<__Succ4> {

	void receive(__Succ1 schan, Err op, org.scribble.runtime.util.Buf<java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ3 schan, ProductNotFound op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ4 schan, UserNotFound op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
