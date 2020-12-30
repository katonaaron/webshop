package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.GetOne;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Select_B_U_GetOne_Long;

import java.io.IOException;

public final class BuyingSession_B_4 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, B> implements Select_B_U_GetOne_Long<BuyingSession_B_5> {
	public static final BuyingSession_B_4 cast = null;

	protected BuyingSession_B_4(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_B_5 send(U role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.GetOne, arg0);

		return new BuyingSession_B_5(this.se, true);
	}
}
