package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Select_B_P_GetAll_List;

import java.io.IOException;

public final class BuyingSession_B_6 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, B> implements Select_B_P_GetAll_List<BuyingSession_B_7> {
	public static final BuyingSession_B_6 cast = null;

	protected BuyingSession_B_6(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_B_7 send(P role, GetAll op, java.lang.Iterable arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.GetAll, arg0);

		return new BuyingSession_B_7(this.se, true);
	}
}
