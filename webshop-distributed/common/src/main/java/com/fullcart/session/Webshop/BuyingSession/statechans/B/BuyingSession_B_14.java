package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Select_B_U_Bye;

import java.io.IOException;

public final class BuyingSession_B_14 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, B> implements Select_B_U_Bye<EndSocket> {
	public static final BuyingSession_B_14 cast = null;

	protected BuyingSession_B_14(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public com.fullcart.session.Webshop.BuyingSession.statechans.B.EndSocket send(U role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Bye);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}
