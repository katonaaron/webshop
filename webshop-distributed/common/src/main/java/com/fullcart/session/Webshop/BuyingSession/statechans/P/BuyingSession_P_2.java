package com.fullcart.session.Webshop.BuyingSession.statechans.P;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Select_P_B_NotFound_Long__B_Ok_List;

import java.io.IOException;

public final class BuyingSession_P_2 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, P> implements Select_P_B_NotFound_Long__B_Ok_List<BuyingSession_P_1, BuyingSession_P_1> {
	public static final BuyingSession_P_2 cast = null;

	protected BuyingSession_P_2(org.scribble.runtime.session.SessionEndpoint<BuyingSession, P> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_P_1 send(B role, Ok op, java.lang.Iterable arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Ok, arg0);

		return new BuyingSession_P_1(this.se, true);
	}

	public BuyingSession_P_1 send(B role, NotFound op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.NotFound, arg0);

		return new BuyingSession_P_1(this.se, true);
	}
}
