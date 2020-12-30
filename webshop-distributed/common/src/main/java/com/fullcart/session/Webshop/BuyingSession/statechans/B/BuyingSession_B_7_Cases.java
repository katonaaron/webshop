package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Branch_B_P_NotFound__P_Ok_List;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Case_B_P_NotFound__P_Ok_List;

public final class BuyingSession_B_7_Cases extends org.scribble.runtime.statechans.CaseSocket<BuyingSession, B> implements Case_B_P_NotFound__P_Ok_List<BuyingSession_B_9, BuyingSession_B_8> {
	public static final BuyingSession_B_7_Cases cast = null;
	public final BuyingSession_B_7.Branch_B_P_NotFound__P_Ok_List_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected BuyingSession_B_7_Cases(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy, BuyingSession_B_7.Branch_B_P_NotFound__P_Ok_List_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public BuyingSession_B_8 receive(P role, Ok op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Ok)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Iterable) m.payload[0];
		return new BuyingSession_B_8(this.se, true);
	}

	public BuyingSession_B_8 receive(Ok op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.P, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_8 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Iterable>) this.se.gc);
	}

	public BuyingSession_B_9 receive(P role, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.NotFound)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new BuyingSession_B_9(this.se, true);
	}

	public BuyingSession_B_9 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.P, op);
	}

	@Override
	public Branch_B_P_NotFound__P_Ok_List.Branch_B_P_NotFound__P_Ok_List_Enum getOp() {
		return this.op;
	}
}
