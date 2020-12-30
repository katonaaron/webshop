package com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.Create;
import com.fullcart.session.Webshop.BuyingSession.roles.B;

import java.io.IOException;

public interface Out_B_Create_Long_List<__Succ extends Succ_Out_B_Create_Long_List> {

	__Succ send(B role, Create op, java.lang.Long arg0, java.lang.Iterable arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}
