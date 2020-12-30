package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;

public interface Case_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<__Succ1 extends Succ_In_B_Ok_Order, __Succ2 extends Succ_In_B_ProductNotFound, __Succ3 extends Succ_In_B_UserNotFound> extends In_B_Ok_Order<__Succ1>, In_B_ProductNotFound<__Succ2>, In_B_UserNotFound<__Succ3> {
	Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound<?, ?, ?> cast = null;

	Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound.Branch_C_B_Ok_Order__B_ProductNotFound__B_UserNotFound_Enum getOp();

	__Succ1 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(ProductNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(UserNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
