package com.fullcart.session.Webshop.BuyingSession.statechans.C;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.C.ioifaces.*;

import java.io.IOException;

public final class BuyingSession_C_4 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, C> implements Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1> {
	public static final BuyingSession_C_4 cast = null;

	protected BuyingSession_C_4(org.scribble.runtime.session.SessionEndpoint<BuyingSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public BuyingSession_C_4_Cases branch(B role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum openum;
		if (m.op.equals(BuyingSession.Ok)) {
			openum = Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum.Ok;
		}
		else if (m.op.equals(BuyingSession.ProductNotFound)) {
			openum = Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum.ProductNotFound;
		}
		else if (m.op.equals(BuyingSession.UserNotFound)) {
			openum = Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum.UserNotFound;
		}
		else if (m.op.equals(BuyingSession.Err)) {
			openum = Branch_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long_Enum.Err;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_C_4_Cases(this.se, true, openum, m);
	}

	public void branch(B role, BuyingSession_C_4_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1>) handler);
	}

	@Override
	public void branch(B role, Handle_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1, BuyingSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.ProductNotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.ProductNotFound, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.UserNotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.UserNotFound, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Err)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Err, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(B role, Handle_C_B_Err_String__B_Ok_Order__B_ProductNotFound_Long__B_UserNotFound_Long<Succ_In_B_Err_String, Succ_In_B_Ok_Order, Succ_In_B_ProductNotFound_Long, Succ_In_B_UserNotFound_Long> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.B);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.OrderDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.ProductNotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.ProductNotFound, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.UserNotFound)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.UserNotFound, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.Err)) {
			handler.receive(new BuyingSession_C_1(this.se, true), BuyingSession.Err, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
