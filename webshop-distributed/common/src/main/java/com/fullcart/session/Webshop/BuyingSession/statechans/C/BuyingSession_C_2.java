package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Receive_C_B_Ok_List;

public final class BuyingSession_C_2 extends org.scribble.runtime.statechans.ReceiveSocket<BuyingSession, C> implements Receive_C_B_Ok_List<BuyingSession_C_1> {
	public static final BuyingSession_C_2 cast = null;

	protected BuyingSession_C_2(org.scribble.runtime.session.SessionEndpoint<BuyingSession, C> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_C_1 receive(B role, Ok op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		arg1.val = (java.lang.Iterable) m.payload[0];
		return new BuyingSession_C_1(this.se, true);
	}

	public BuyingSession_C_1 async(B role, Ok op, org.scribble.runtime.util.Buf<BuyingSession_C_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new BuyingSession_C_2_Future(super.getFuture(BuyingSession.B));
		return new BuyingSession_C_1(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(BuyingSession.B);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_C_1 async(B role, Ok op) throws org.scribble.main.ScribRuntimeException {
		return async(BuyingSession.B, op, (org.scribble.runtime.util.Buf<BuyingSession_C_2_Future>) this.se.gc);
	}
}
