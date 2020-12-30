package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Create;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

public interface In_C_Create_Long_List<__Succ extends Succ_In_C_Create_Long_List> {

	__Succ receive(C role, Create op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
