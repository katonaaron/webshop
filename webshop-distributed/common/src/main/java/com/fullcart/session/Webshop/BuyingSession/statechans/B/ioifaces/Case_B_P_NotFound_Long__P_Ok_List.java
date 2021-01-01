package com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces;

import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;

public interface Case_B_P_NotFound_Long__P_Ok_List<__Succ1 extends Succ_In_P_NotFound_Long, __Succ2 extends Succ_In_P_Ok_List> extends In_P_NotFound_Long<__Succ1>, In_P_Ok_List<__Succ2> {
	Branch_B_P_NotFound_Long__P_Ok_List<?, ?> cast = null;

	Branch_B_P_NotFound_Long__P_Ok_List.Branch_B_P_NotFound_Long__P_Ok_List_Enum getOp();

	__Succ1 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
