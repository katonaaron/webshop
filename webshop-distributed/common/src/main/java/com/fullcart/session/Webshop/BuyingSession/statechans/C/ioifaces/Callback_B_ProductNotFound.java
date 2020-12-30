package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;

public interface Callback_B_ProductNotFound<__Succ extends Succ_In_B_ProductNotFound> {

	void receive(__Succ schan, ProductNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
