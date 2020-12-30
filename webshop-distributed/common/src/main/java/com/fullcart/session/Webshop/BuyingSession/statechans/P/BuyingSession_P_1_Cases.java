package com.fullcart.session.Webshop.BuyingSession.statechans.P;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.Bye;
import com.fullcart.session.Webshop.BuyingSession.ops.GetAll;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Branch_P_B_Bye__B_GetAll_List;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Case_P_B_Bye__B_GetAll_List;

public final class BuyingSession_P_1_Cases extends org.scribble.runtime.statechans.CaseSocket<BuyingSession, P> implements Case_P_B_Bye__B_GetAll_List<EndSocket, BuyingSession_P_2> {
	public static final BuyingSession_P_1_Cases cast = null;
	public final BuyingSession_P_1.Branch_P_B_Bye__B_GetAll_List_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected BuyingSession_P_1_Cases(org.scribble.runtime.session.SessionEndpoint<BuyingSession, P> se, boolean dummy, BuyingSession_P_1.Branch_P_B_Bye__B_GetAll_List_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public BuyingSession_P_2 receive(B role, GetAll op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.GetAll)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Iterable) m.payload[0];
		return new BuyingSession_P_2(this.se, true);
	}

	public BuyingSession_P_2 receive(GetAll op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.B, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_P_2 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Iterable>) this.se.gc);
	}

	public com.fullcart.session.Webshop.BuyingSession.statechans.P.EndSocket receive(B role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public com.fullcart.session.Webshop.BuyingSession.statechans.P.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.B, op);
	}

	@Override
	public Branch_P_B_Bye__B_GetAll_List.Branch_P_B_Bye__B_GetAll_List_Enum getOp() {
		return this.op;
	}
}
