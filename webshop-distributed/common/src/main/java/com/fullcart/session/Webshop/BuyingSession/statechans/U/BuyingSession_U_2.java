package com.fullcart.session.Webshop.BuyingSession.statechans.U;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Select_U_B_NotFound__B_Ok_User;

import java.io.IOException;

public final class BuyingSession_U_2 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, U> implements Select_U_B_NotFound__B_Ok_User<BuyingSession_U_1, BuyingSession_U_1> {
	public static final BuyingSession_U_2 cast = null;

	protected BuyingSession_U_2(org.scribble.runtime.session.SessionEndpoint<BuyingSession, U> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_U_1 send(B role, Ok op, com.fullcart.dto.UserDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Ok, arg0);

		return new BuyingSession_U_1(this.se, true);
	}

	public BuyingSession_U_1 send(B role, NotFound op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.NotFound);

		return new BuyingSession_U_1(this.se, true);
	}
}
