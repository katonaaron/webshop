package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_ProductNotFound<__Succ extends Succ_In_B_ProductNotFound> {

	__Succ receive(B role, ProductNotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
