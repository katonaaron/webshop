package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Select_B_C_NotAllowed__C_Ok_Order;

import java.io.IOException;

public final class BuyingSession_B_11 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, B> implements Select_B_C_NotAllowed__C_Ok_Order<BuyingSession_B_1, BuyingSession_B_1> {
	public static final BuyingSession_B_11 cast = null;

	protected BuyingSession_B_11(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_B_1 send(C role, Ok op, com.fullcart.dto.OrderDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Ok, arg0);

		return new BuyingSession_B_1(this.se, true);
	}

	public BuyingSession_B_1 send(C role, NotAllowed op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.NotAllowed);

		return new BuyingSession_B_1(this.se, true);
	}
}
