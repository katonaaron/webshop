package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.All;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

public interface In_B_All_List<__Succ extends Succ_In_B_All_List> {

	__Succ receive(B role, All op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
