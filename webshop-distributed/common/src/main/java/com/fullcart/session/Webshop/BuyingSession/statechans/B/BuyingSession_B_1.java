package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.*;

import java.io.IOException;

public final class BuyingSession_B_1 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, B> implements Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<BuyingSession_B_13, BuyingSession_B_11, BuyingSession_B_12, BuyingSession_B_4, BuyingSession_B_2, BuyingSession_B_3> {
	public static final BuyingSession_B_1 cast = null;

	protected BuyingSession_B_1(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	public BuyingSession_B_1(org.scribble.runtime.session.MPSTEndpoint<BuyingSession, B> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public BuyingSession_B_1_Cases branch(C role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.C);
		Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum openum;
		if (m.op.equals(BuyingSession.GetAll)) {
			openum = Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum.GetAll;
		}
		else if (m.op.equals(BuyingSession.GetOne)) {
			openum = Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum.GetOne;
		}
		else if (m.op.equals(BuyingSession.Create)) {
			openum = Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum.Create;
		}
		else if (m.op.equals(BuyingSession.Cancel)) {
			openum = Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum.Cancel;
		}
		else if (m.op.equals(BuyingSession.Complete)) {
			openum = Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum.Complete;
		}
		else if (m.op.equals(BuyingSession.Bye)) {
			openum = Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum.Bye;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_B_1_Cases(this.se, true, openum, m);
	}

	public void branch(C role, BuyingSession_B_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<BuyingSession_B_13, BuyingSession_B_11, BuyingSession_B_12, BuyingSession_B_4, BuyingSession_B_2, BuyingSession_B_3>) handler);
	}

	@Override
	public void branch(C role, Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<BuyingSession_B_13, BuyingSession_B_11, BuyingSession_B_12, BuyingSession_B_4, BuyingSession_B_2, BuyingSession_B_3> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.C);
		if (m.op.equals(BuyingSession.GetAll)) {
			handler.receive(new BuyingSession_B_2(this.se, true), BuyingSession.GetAll);
		}
		else
		if (m.op.equals(BuyingSession.GetOne)) {
			handler.receive(new BuyingSession_B_3(this.se, true), BuyingSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Create)) {
			handler.receive(new BuyingSession_B_4(this.se, true), BuyingSession.Create, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Cancel)) {
			handler.receive(new BuyingSession_B_11(this.se, true), BuyingSession.Cancel, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Complete)) {
			handler.receive(new BuyingSession_B_12(this.se, true), BuyingSession.Complete, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Bye)) {
			handler.receive(new BuyingSession_B_13(this.se, true), BuyingSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(C role, Handle_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<Succ_In_C_Bye, Succ_In_C_Cancel_Long, Succ_In_C_Complete_Long, Succ_In_C_Create_Order, Succ_In_C_GetAll, Succ_In_C_GetOne_Long> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.C);
		if (m.op.equals(BuyingSession.GetAll)) {
			handler.receive(new BuyingSession_B_2(this.se, true), BuyingSession.GetAll);
		}
		else
		if (m.op.equals(BuyingSession.GetOne)) {
			handler.receive(new BuyingSession_B_3(this.se, true), BuyingSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Create)) {
			handler.receive(new BuyingSession_B_4(this.se, true), BuyingSession.Create, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Cancel)) {
			handler.receive(new BuyingSession_B_11(this.se, true), BuyingSession.Cancel, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Complete)) {
			handler.receive(new BuyingSession_B_12(this.se, true), BuyingSession.Complete, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Bye)) {
			handler.receive(new BuyingSession_B_13(this.se, true), BuyingSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
