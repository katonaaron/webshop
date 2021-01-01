package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Select_B_C_UserNotFound_Long;

import java.io.IOException;

public final class BuyingSession_B_10 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, B> implements Select_B_C_UserNotFound_Long<BuyingSession_B_1> {
	public static final BuyingSession_B_10 cast = null;

	protected BuyingSession_B_10(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_B_1 send(C role, UserNotFound op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.UserNotFound, arg0);

		return new BuyingSession_B_1(this.se, true);
	}
}
