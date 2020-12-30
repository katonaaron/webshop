package com.fullcart.session.Webshop.BuyingSession.statechans.U;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetOne;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Branch_U_B_Bye__B_GetOne_Long;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Case_U_B_Bye__B_GetOne_Long;

public final class BuyingSession_U_1_Cases extends org.scribble.runtime.statechans.CaseSocket<BuyingSession, U> implements Case_U_B_Bye__B_GetOne_Long<EndSocket, BuyingSession_U_2> {
	public static final BuyingSession_U_1_Cases cast = null;
	public final BuyingSession_U_1.Branch_U_B_Bye__B_GetOne_Long_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected BuyingSession_U_1_Cases(org.scribble.runtime.session.SessionEndpoint<BuyingSession, U> se, boolean dummy, BuyingSession_U_1.Branch_U_B_Bye__B_GetOne_Long_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public BuyingSession_U_2 receive(B role, GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.GetOne)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new BuyingSession_U_2(this.se, true);
	}

	public BuyingSession_U_2 receive(GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.B, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_U_2 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public com.fullcart.session.Webshop.BuyingSession.statechans.U.EndSocket receive(B role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public com.fullcart.session.Webshop.BuyingSession.statechans.U.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.B, op);
	}

	@Override
	public Branch_U_B_Bye__B_GetOne_Long.Branch_U_B_Bye__B_GetOne_Long_Enum getOp() {
		return this.op;
	}
}
