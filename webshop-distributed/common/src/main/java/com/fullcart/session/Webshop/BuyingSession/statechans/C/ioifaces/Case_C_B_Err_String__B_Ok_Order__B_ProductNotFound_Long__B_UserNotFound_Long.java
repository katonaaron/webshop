package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Err;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;

public interface Case_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<__Succ1 extends Succ_In_B_Err_String, __Succ2 extends Succ_In_B_Ok_Order, __Succ3 extends Succ_In_B_ProductNotFound_Long, __Succ4 extends Succ_In_B_UserNotFound_Long> extends In_B_Err_String<__Succ1>, In_B_Ok_Order<__Succ2>, In_B_ProductNotFound_Long<__Succ3>, In_B_UserNotFound_Long<__Succ4> {
	Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<?, ?, ?, ?> cast = null;

	Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long.Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum getOp();

	__Succ1 receive(Err op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(ProductNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ4 receive(UserNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
