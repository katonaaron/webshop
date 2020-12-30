package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.Err;
import com.fullcart.session.Webshop.UserSession.ops.NotFound;
import com.fullcart.session.Webshop.UserSession.ops.Ok;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Branch_C_U_Err_String__U_NotFound__U_Ok_User;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.Case_C_U_Err_String__U_NotFound__U_Ok_User;

public final class UserSession_C_5_Cases extends org.scribble.runtime.statechans.CaseSocket<UserSession, C> implements Case_C_U_Err_String__U_NotFound__U_Ok_User<UserSession_C_1, UserSession_C_1, UserSession_C_1> {
	public static final UserSession_C_5_Cases cast = null;
	public final UserSession_C_5.Branch_C_U_Err_String__U_NotFound__U_Ok_User_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected UserSession_C_5_Cases(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy, UserSession_C_5.Branch_C_U_Err_String__U_NotFound__U_Ok_User_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public UserSession_C_1 receive(U role, Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Ok)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.UserDTO) m.payload[0];
		return new UserSession_C_1(this.se, true);
	}

	public UserSession_C_1 receive(Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.U, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public UserSession_C_1 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO>) this.se.gc);
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

	public UserSession_C_1 receive(U role, Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Err)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.String) m.payload[0];
		return new UserSession_C_1(this.se, true);
	}

	public UserSession_C_1 receive(Err op, org.scribble.runtime.util.Buf<? super java.lang.String> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.U, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public UserSession_C_1 receive(Err op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.String>) this.se.gc);
	}

	@Override
	public Branch_C_U_Err_String__U_NotFound__U_Ok_User.Branch_C_U_Err_String__U_NotFound__U_Ok_User_Enum getOp() {
		return this.op;
	}
}
