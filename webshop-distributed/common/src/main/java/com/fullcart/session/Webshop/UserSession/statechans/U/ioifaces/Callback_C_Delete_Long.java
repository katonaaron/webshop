package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.Delete;

public interface Callback_C_Delete_Long<__Succ extends Succ_In_C_Delete_Long> {

	void receive(__Succ schan, Delete op, org.scribble.runtime.util.Buf<java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
