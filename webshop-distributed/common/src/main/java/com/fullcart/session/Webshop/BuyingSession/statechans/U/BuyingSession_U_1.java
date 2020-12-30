package com.fullcart.session.Webshop.BuyingSession.statechans.U;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Branch_U_B_Bye__B_GetOne_Long;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Handle_U_B_Bye__B_GetOne_Long;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Succ_In_B_Bye;
import com.fullcart.session.Webshop.BuyingSession.statechans.U.ioifaces.Succ_In_B_GetOne_Long;

import java.io.IOException;

public final class BuyingSession_U_1 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, U> implements Branch_U_B_Bye__B_GetOne_Long<EndSocket, BuyingSession_U_2> {
	public static final BuyingSession_U_1 cast = null;

	protected BuyingSession_U_1(org.scribble.runtime.session.SessionEndpoint<BuyingSession, U> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_U_1(org.scribble.runtime.session.MPSTEndpoint<BuyingSession, U> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public BuyingSession_U_1_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		Branch_U_B_Bye__B_GetOne_Long_Enum openum;
		if (m.op.equals(BuyingSession.GetOne)) {
			openum = Branch_U_B_Bye__B_GetOne_Long_Enum.GetOne;
		}
		else if (m.op.equals(BuyingSession.Bye)) {
			openum = Branch_U_B_Bye__B_GetOne_Long_Enum.Bye;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_U_1_Cases(this.se, true, openum, m);
	}

	public void branch(B role, BuyingSession_U_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_U_B_Bye__B_GetOne_Long<EndSocket, BuyingSession_U_2>) handler);
	}

	@Override
	public void branch(B role, Handle_U_B_Bye__B_GetOne_Long<EndSocket, BuyingSession_U_2> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.GetOne)) {
			handler.receive(new BuyingSession_U_2(this.se, true), BuyingSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
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
	public void handle(B role, Handle_U_B_Bye__B_GetOne_Long<Succ_In_B_Bye, Succ_In_B_GetOne_Long> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.GetOne)) {
			handler.receive(new BuyingSession_U_2(this.se, true), BuyingSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
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
