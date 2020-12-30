package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Branch_B_U_NotFound__U_Ok_User;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Handle_B_U_NotFound__U_Ok_User;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Succ_In_U_NotFound;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Succ_In_U_Ok_User;

import java.io.IOException;

public final class BuyingSession_B_5 extends org.scribble.runtime.statechans.BranchSocket<BuyingSession, B> implements Branch_B_U_NotFound__U_Ok_User<BuyingSession_B_10, BuyingSession_B_6> {
	public static final BuyingSession_B_5 cast = null;

	protected BuyingSession_B_5(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy) {
		super(se);
	}

	@Override
	public BuyingSession_B_5_Cases branch(U role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.U);
		Branch_B_U_NotFound__U_Ok_User_Enum openum;
		if (m.op.equals(BuyingSession.Ok)) {
			openum = Branch_B_U_NotFound__U_Ok_User_Enum.Ok;
		}
		else if (m.op.equals(BuyingSession.NotFound)) {
			openum = Branch_B_U_NotFound__U_Ok_User_Enum.NotFound;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new BuyingSession_B_5_Cases(this.se, true, openum, m);
	}

	public void branch(U role, BuyingSession_B_5_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_B_U_NotFound__U_Ok_User<BuyingSession_B_10, BuyingSession_B_6>) handler);
	}

	@Override
	public void branch(U role, Handle_B_U_NotFound__U_Ok_User<BuyingSession_B_10, BuyingSession_B_6> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.U);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_B_6(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_B_10(this.se, true), BuyingSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(U role, Handle_B_U_NotFound__U_Ok_User<Succ_In_U_NotFound, Succ_In_U_Ok_User> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(BuyingSession.U);
		if (m.op.equals(BuyingSession.Ok)) {
			handler.receive(new BuyingSession_B_6(this.se, true), BuyingSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(BuyingSession.NotFound)) {
			handler.receive(new BuyingSession_B_10(this.se, true), BuyingSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
