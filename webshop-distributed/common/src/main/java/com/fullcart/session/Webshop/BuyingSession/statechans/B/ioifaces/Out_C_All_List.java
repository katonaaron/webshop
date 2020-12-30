package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.All;
import com.fullcart.session.Webshop.BuyingSession.roles.C;

import java.io.IOException;

public interface Out_C_All_List<__Succ extends Succ_Out_C_All_List> {

	__Succ send(C role, All op, java.lang.Iterable arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}
