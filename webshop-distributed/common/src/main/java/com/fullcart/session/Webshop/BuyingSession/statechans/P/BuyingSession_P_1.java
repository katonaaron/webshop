package com.fullcart.session.Webshop.BuyingSession.statechans.P;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Branch_P_B_Bye__B_GetAll_List;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Handle_P_B_Bye__B_GetAll_List;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Succ_In_B_Bye;
import com.fullcart.session.Webshop.BuyingSession.statechans.P.ioifaces.Succ_In_B_GetAll_List;

import java.io.IOException;

public final class BuyingSession_P_1 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, P> implements Branch_P_B_Bye__B_GetAll_List<EndSocket, BuyingSession_P_2> {
	public static final BuyingSession_P_1 cast = null;

	protected BuyingSession_P_1(org.scribble.runtime.session.SessionEndpoint<BuyingSession, P> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_P_1(org.scribble.runtime.session.MPSTEndpoint<BuyingSession, P> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public BuyingSession_P_1_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		Branch_P_B_Bye__B_GetAll_List_Enum openum;
		if (m.op.equals(BuyingSession.GetAll)) {
			openum = Branch_P_B_Bye__B_GetAll_List_Enum.GetAll;
		}
		else if (m.op.equals(BuyingSession.Bye)) {
			openum = Branch_P_B_Bye__B_GetAll_List_Enum.Bye;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_P_1_Cases(this.se, true, openum, m);
	}

	public void branch(B role, BuyingSession_P_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_P_B_Bye__B_GetAll_List<EndSocket, BuyingSession_P_2>) handler);
	}

	@Override
	public void branch(B role, Handle_P_B_Bye__B_GetAll_List<EndSocket, BuyingSession_P_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.GetAll)) {
			handler.receive(new BuyingSession_P_2(this.se, true), BuyingSession.GetAll, new org.scribble.runtime.util.Buf<>((java.lang.Iterable) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Bye)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), BuyingSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(B role, Handle_P_B_Bye__B_GetAll_List<Succ_In_B_Bye, Succ_In_B_GetAll_List> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.GetAll)) {
			handler.receive(new BuyingSession_P_2(this.se, true), BuyingSession.GetAll, new org.scribble.runtime.util.Buf<>((java.lang.Iterable) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Bye)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), BuyingSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
