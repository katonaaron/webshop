package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Branch_C_U_NotFound__U_Ok;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Handle_C_U_NotFound__U_Ok;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Succ_In_U_NotFound;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Succ_In_U_Ok;

import java.io.IOException;

public final class UserSession_C_7 extends org.scribble.runtime.statechans.BranchSocket<UserSession, C> implements Branch_C_U_NotFound__U_Ok<UserSession_C_1, UserSession_C_1> {
	public static final UserSession_C_7 cast = null;

	protected UserSession_C_7(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public UserSession_C_7_Cases branch(U role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		Branch_C_U_NotFound__U_Ok_Enum openum;
		if (m.op.equals(UserSession.Ok)) {
			openum = Branch_C_U_NotFound__U_Ok_Enum.Ok;
		}
		else if (m.op.equals(UserSession.NotFound)) {
			openum = Branch_C_U_NotFound__U_Ok_Enum.NotFound;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new UserSession_C_7_Cases(this.se, true, openum, m);
	}

	public void branch(U role, UserSession_C_7_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_U_NotFound__U_Ok<UserSession_C_1, UserSession_C_1>) handler);
	}

	@Override
	public void branch(U role, Handle_C_U_NotFound__U_Ok<UserSession_C_1, UserSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		if (m.op.equals(UserSession.Ok)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Ok);
		}
		else
		if (m.op.equals(UserSession.NotFound)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(U role, Handle_C_U_NotFound__U_Ok<Succ_In_U_NotFound, Succ_In_U_Ok> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		if (m.op.equals(UserSession.Ok)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Ok);
		}
		else
		if (m.op.equals(UserSession.NotFound)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.NotFound);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
