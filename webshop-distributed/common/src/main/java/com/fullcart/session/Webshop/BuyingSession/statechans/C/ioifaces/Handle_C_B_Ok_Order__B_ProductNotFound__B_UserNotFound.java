package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;

public interface Handle_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<__Succ1 extends Succ_In_B_Ok_Order, __Succ2 extends Succ_In_B_ProductNotFound, __Succ3 extends Succ_In_B_UserNotFound> extends Callback_B_Ok_Order<__Succ1>, Callback_B_ProductNotFound<__Succ2>, Callback_B_UserNotFound<__Succ3> {

	void receive(__Succ1 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, ProductNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ3 schan, UserNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
