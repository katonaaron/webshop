package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.*;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long;

import java.io.IOException;

public final class BuyingSession_C_1 extends org.scribble.runtime.statechans.OutputSocket<BuyingSession, C> implements Select_C_B_Bye__B_Cancel_Long__B_Complete_Long__B_Create_Order__B_GetAll__B_GetOne_Long<EndSocket, BuyingSession_C_5, BuyingSession_C_6, BuyingSession_C_4, BuyingSession_C_2, BuyingSession_C_3> {
	public static final BuyingSession_C_1 cast = null;

	protected BuyingSession_C_1(org.scribble.runtime.session.SessionEndpoint<BuyingSession, C> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_C_1(org.scribble.runtime.session.MPSTEndpoint<BuyingSession, C> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public BuyingSession_C_2 send(B role, GetAll op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.GetAll);

		return new BuyingSession_C_2(this.se, true);
	}

	public BuyingSession_C_3 send(B role, GetOne op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.GetOne, arg0);

		return new BuyingSession_C_3(this.se, true);
	}

	public BuyingSession_C_4 send(B role, Create op, com.fullcart.dto.OrderDTO arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Create, arg0);

		return new BuyingSession_C_4(this.se, true);
	}

	public BuyingSession_C_5 send(B role, Cancel op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Cancel, arg0);

		return new BuyingSession_C_5(this.se, true);
	}

	public BuyingSession_C_6 send(B role, Complete op, java.lang.Long arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Complete, arg0);

		return new BuyingSession_C_6(this.se, true);
	}

	public com.fullcart.session.Webshop.BuyingSession.statechans.C.EndSocket send(B role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, BuyingSession.Bye);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}
