package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_ProductNotFound<__Succ extends Succ_Out_C_ProductNotFound> {

	__Succ send(C role, ProductNotFound op) throws org.scribble.main.ScribRuntimeException, IOException;
}
