package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.*;

import java.io.IOException;

public final class BuyingSession_C_6 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, C> implements Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1> {
	public static final BuyingSession_C_6 cast = null;

	protected BuyingSession_C_6(org.scribble.runtime.session.SessionEndpoint<BuyingSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public BuyingSession_C_6_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order_Enum openum;
		if (m.op.equals(BuyingSession.Ok)) {
			openum = Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order_Enum.Ok;
		}
		else if (m.op.equals(BuyingSession.NotFound)) {
			openum = Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order_Enum.NotFound;
		}
		else if (m.op.equals(BuyingSession.NotAllowed)) {
			openum = Branch_C_B_NotAllowed__B_NotFound__B_Ok_Order_Enum.NotAllowed;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_C_6_Cases(this.se, true, openum, m);
	}

	public void branch(B role, BuyingSession_C_6_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_B_NotAllowed__B_NotFound__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1>) handler);
	}

	@Override
	public void branch(B role, Handle_C_B_NotAllowed__B_NotFound__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.NotFound);
		}
		else
		if (m.op.equals(BuyingSession.NotAllowed)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.NotAllowed);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(B role, Handle_C_B_NotAllowed__B_NotFound__B_Ok_Order<Succ_In_B_NotAllowed, Succ_In_B_NotFound, Succ_In_B_Ok_Order> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.NotFound);
		}
		else
		if (m.op.equals(BuyingSession.NotAllowed)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.NotAllowed);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
