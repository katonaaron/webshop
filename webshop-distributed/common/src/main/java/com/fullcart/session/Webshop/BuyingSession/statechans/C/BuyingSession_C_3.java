package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Branch_C_B_NotFound__B_Ok_Order;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Handle_C_B_NotFound__B_Ok_Order;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Succ_In_B_NotFound;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.Succ_In_B_Ok_Order;

import java.io.IOException;

public final class BuyingSession_C_3 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, C> implements Branch_C_B_NotFound__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1> {
	public static final BuyingSession_C_3 cast = null;

	protected BuyingSession_C_3(org.scribble.runtime.session.SessionEndpoint<BuyingSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public BuyingSession_C_3_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		Branch_C_B_NotFound__B_Ok_Order_Enum openum;
		if (m.op.equals(BuyingSession.Ok)) {
			openum = Branch_C_B_NotFound__B_Ok_Order_Enum.Ok;
		}
		else if (m.op.equals(BuyingSession.NotFound)) {
			openum = Branch_C_B_NotFound__B_Ok_Order_Enum.NotFound;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_C_3_Cases(this.se, true, openum, m);
	}

	public void branch(B role, BuyingSession_C_3_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_B_NotFound__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1>) handler);
	}

	@Override
	public void branch(B role, Handle_C_B_NotFound__B_Ok_Order<BuyingSession_C_1, BuyingSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(B role, Handle_C_B_NotFound__B_Ok_Order<Succ_In_B_NotFound, Succ_In_B_Ok_Order> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
