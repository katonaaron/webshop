package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;
import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;

public interface Case_C_B_NotAllowed__B_NotFound__B_Ok_Order<__Succ1 extends Succ_In_B_NotAllowed, __Succ2 extends Succ_In_B_NotFound, __Succ3 extends Succ_In_B_Ok_Order> extends In_B_NotAllowed<__Succ1>, In_B_NotFound<__Succ2>, In_B_Ok_Order<__Succ3> {
	Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order<?, ?, ?> cast = null;

	Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order.Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order_Enum getOp();

	__Succ1 receive(NotAllowed op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
