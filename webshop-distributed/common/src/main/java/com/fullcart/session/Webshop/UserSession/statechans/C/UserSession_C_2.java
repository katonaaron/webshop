package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Receive_C_U_Ok_List;

public final class UserSession_C_2 extends org.scribble.runtime.statechans.ReceiveSocket<UserSession, C> implements Receive_C_U_Ok_List<UserSession_C_1> {
	public static final UserSession_C_2 cast = null;

	protected UserSession_C_2(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy) {
		super(se);
	}

	public UserSession_C_1 receive(U role, Ok op, org.scribble.runtime.util.Buf<? super java.lang.Iterable> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		arg1.val = (java.lang.Iterable) m.payload[0];
		return new UserSession_C_1(this.se, true);
	}

	public UserSession_C_1 async(U role, Ok op, org.scribble.runtime.util.Buf<UserSession_C_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new UserSession_C_2_Future(super.getFuture(UserSession.U));
		return new UserSession_C_1(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(UserSession.U);
	}

	@SuppressWarnings("unchecked")
	public UserSession_C_1 async(U role, Ok op) throws org.scribble.main.ScribRuntimeException {
		return async(UserSession.U, op, (org.scribble.runtime.util.Buf<UserSession_C_2_Future>) this.se.gc);
	}
}
