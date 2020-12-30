package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Select_B_P_Bye;

import java.io.IOException;

public final class BuyingSession_B_13 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, B> implements Select_B_P_Bye<BuyingSession_B_14> {
	public static final BuyingSession_B_13 cast = null;

	protected BuyingSession_B_13(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_B_14 send(P role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Bye);

		return new BuyingSession_B_14(this.se, true);
	}
}
