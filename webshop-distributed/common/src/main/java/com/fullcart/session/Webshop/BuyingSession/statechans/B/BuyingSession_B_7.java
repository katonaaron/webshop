package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Branch_B_P_NotFound__P_Ok_List;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Handle_B_P_NotFound__P_Ok_List;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Succ_In_P_NotFound;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Succ_In_P_Ok_List;

import java.io.IOException;

public final class BuyingSession_B_7 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, B> implements Branch_B_P_NotFound__P_Ok_List<BuyingSession_B_9, BuyingSession_B_8> {
	public static final BuyingSession_B_7 cast = null;

	protected BuyingSession_B_7(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	@Override
	public BuyingSession_B_7_Cases branch(P role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.P);
		Branch_B_P_NotFound__P_Ok_List_Enum openum;
		if (m.op.equals(BuyingSession.Ok)) {
			openum = Branch_B_P_NotFound__P_Ok_List_Enum.Ok;
		}
		else if (m.op.equals(BuyingSession.NotFound)) {
			openum = Branch_B_P_NotFound__P_Ok_List_Enum.NotFound;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_B_7_Cases(this.se, true, openum, m);
	}

	public void branch(P role, BuyingSession_B_7_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_B_P_NotFound__P_Ok_List<BuyingSession_B_9, BuyingSession_B_8>) handler);
	}

	@Override
	public void branch(P role, Handle_B_P_NotFound__P_Ok_List<BuyingSession_B_9, BuyingSession_B_8> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.P);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_B_8(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((java.lang.Iterable) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_B_9(this.se, true), BuyingSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(P role, Handle_B_P_NotFound__P_Ok_List<Succ_In_P_NotFound, Succ_In_P_Ok_List> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.P);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_B_8(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((java.lang.Iterable) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_B_9(this.se, true), BuyingSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
