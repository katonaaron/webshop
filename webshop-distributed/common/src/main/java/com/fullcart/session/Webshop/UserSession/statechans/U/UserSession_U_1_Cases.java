package com.fullcart.session.Webshop.UserSession.statechans.U;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.ops.*;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.Case_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User;

public final class UserSession_U_1_Cases extends org.scribble.runtime.statechans.CaseSocket<UserSession, U> implements Case_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<EndSocket, UserSession_U_4, UserSession_U_7, UserSession_U_2, UserSession_U_3, UserSession_U_6, UserSession_U_5> {
	public static final UserSession_U_1_Cases cast = null;
	public final UserSession_U_1.Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected UserSession_U_1_Cases(org.scribble.runtime.session.SessionEndpoint<UserSession, U> se, boolean dummy, UserSession_U_1.Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public UserSession_U_2 receive(C role, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.GetAll)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new UserSession_U_2(this.se, true);
	}

	public UserSession_U_2 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op);
	}

	public UserSession_U_3 receive(C role, GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.GetOne)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new UserSession_U_3(this.se, true);
	}

	public UserSession_U_3 receive(GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public UserSession_U_3 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public UserSession_U_4 receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Create)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.UserDTO) m.payload[0];
		return new UserSession_U_4(this.se, true);
	}

	public UserSession_U_4 receive(Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public UserSession_U_4 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO>) this.se.gc);
	}

	public UserSession_U_5 receive(C role, Update op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Update)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (com.fullcart.dto.UserDTO) m.payload[1];
		return new UserSession_U_5(this.se, true);
	}

	public UserSession_U_5 receive(Update op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op, arg1, arg2);
	}

	@SuppressWarnings("unchecked")
	public UserSession_U_5 receive(Update op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO>) this.se.gc);
	}

	public UserSession_U_6 receive(C role, Replace op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Replace)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		arg2.val = (com.fullcart.dto.UserDTO) m.payload[1];
		return new UserSession_U_6(this.se, true);
	}

	public UserSession_U_6 receive(Replace op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op, arg1, arg2);
	}

	@SuppressWarnings("unchecked")
	public UserSession_U_6 receive(Replace op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc, (org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO>) this.se.gc);
	}

	public UserSession_U_7 receive(C role, Delete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Delete)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new UserSession_U_7(this.se, true);
	}

	public UserSession_U_7 receive(Delete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public UserSession_U_7 receive(Delete op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public com.fullcart.session.Webshop.UserSession.statechans.U.EndSocket receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(UserSession.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public com.fullcart.session.Webshop.UserSession.statechans.U.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(UserSession.C, op);
	}

	@Override
	public Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User.Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum getOp() {
		return this.op;
	}
}
