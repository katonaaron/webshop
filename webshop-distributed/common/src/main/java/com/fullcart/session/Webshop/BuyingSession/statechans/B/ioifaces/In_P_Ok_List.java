package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.P;

public interface In_P_Ok_List<__Succ extends Succ_In_P_Ok_List> {

	__Succ receive(P role, Ok op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
