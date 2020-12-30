package com.fullcart.session.Webshop.UserSession.statechans.C;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces.*;

import java.io.IOException;

public final class UserSession_C_6 extends org.scribble.runtime.statechans.BranchSocket<UserSession, C> implements Branch_C_U_Created_User__U_Err_String__U_Ok_User<UserSession_C_1, UserSession_C_1, UserSession_C_1> {
	public static final UserSession_C_6 cast = null;

	protected UserSession_C_6(org.scribble.runtime.session.SessionEndpoint<UserSession, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public UserSession_C_6_Cases branch(U role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		Branch_C_U_Created_User__U_Err_String__U_Ok_User_Enum openum;
		if (m.op.equals(UserSession.Ok)) {
			openum = Branch_C_U_Created_User__U_Err_String__U_Ok_User_Enum.Ok;
		}
		else if (m.op.equals(UserSession.Created)) {
			openum = Branch_C_U_Created_User__U_Err_String__U_Ok_User_Enum.Created;
		}
		else if (m.op.equals(UserSession.Err)) {
			openum = Branch_C_U_Created_User__U_Err_String__U_Ok_User_Enum.Err;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new UserSession_C_6_Cases(this.se, true, openum, m);
	}

	public void branch(U role, UserSession_C_6_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_C_U_Created_User__U_Err_String__U_Ok_User<UserSession_C_1, UserSession_C_1, UserSession_C_1>) handler);
	}

	@Override
	public void branch(U role, Handle_C_U_Created_User__U_Err_String__U_Ok_User<UserSession_C_1, UserSession_C_1, UserSession_C_1> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		if (m.op.equals(UserSession.Ok)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Created)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Created, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Err)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Err, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(U role, Handle_C_U_Created_User__U_Err_String__U_Ok_User<Succ_In_U_Created_User, Succ_In_U_Err_String, Succ_In_U_Ok_User> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.U);
		if (m.op.equals(UserSession.Ok)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Ok, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Created)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Created, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Err)) {
			handler.receive(new UserSession_C_1(this.se, true), UserSession.Err, new org.scribble.runtime.util.Buf<>((java.lang.String) m.payload[0]));
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
