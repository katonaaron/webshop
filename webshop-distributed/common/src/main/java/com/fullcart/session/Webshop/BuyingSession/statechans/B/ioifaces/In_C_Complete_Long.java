package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Complete;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

public interface In_C_Complete_Long<__Succ extends Succ_In_C_Complete_Long> {

	__Succ receive(C role, Complete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
