package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;
import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;

public interface Handle_C_B_NotAllowed__B_NotFound__B_Ok_Order<__Succ1 extends Succ_In_B_NotAllowed, __Succ2 extends Succ_In_B_NotFound, __Succ3 extends Succ_In_B_Ok_Order> extends Callback_B_NotAllowed<__Succ1>, Callback_B_NotFound<__Succ2>, Callback_B_Ok_Order<__Succ3> {

	void receive(__Succ1 schan, NotAllowed op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ2 schan, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void receive(__Succ3 schan, Ok op, org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
