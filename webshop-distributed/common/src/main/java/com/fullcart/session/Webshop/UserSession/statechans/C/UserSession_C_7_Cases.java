package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Branch_C_U_NotFound__U_Ok;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Case_C_U_NotFound__U_Ok;

public final class UserSession_C_7_Cases extends org.scribble.runtime.statechans.CaseSocket<UserSession, C> implements Case_C_U_NotFound__U_Ok<UserSession_C_1, UserSession_C_1> {
	public static final UserSession_C_7_Cases cast = null;
	public final UserSession_C_7.Branch_C_U_NotFound__U_Ok_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected UserSession_C_7_Cases(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy, UserSession_C_7.Branch_C_U_NotFound__U_Ok_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public UserSession_C_1 receive(U role, Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Ok)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new UserSession_C_1(this.se, true);
	}

	public UserSession_C_1 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.U, op);
	}

	public UserSession_C_1 receive(U role, NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.NotFound)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new UserSession_C_1(this.se, true);
	}

	public UserSession_C_1 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.U, op);
	}

	@Override
	public Branch_C_U_NotFound__U_Ok.Branch_C_U_NotFound__U_Ok_Enum getOp() {
		return this.op;
	}
}
