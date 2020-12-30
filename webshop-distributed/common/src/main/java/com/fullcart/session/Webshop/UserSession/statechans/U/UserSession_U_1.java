package com.fullcart.session.Webshop.UserSession.statechans.U;

import com.fullcart.session.Webshop.UserSession.UserSession;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces.*;

import java.io.IOException;

public final class UserSession_U_1 extends org.scribble.runtime.statechans.BranchSocket<UserSession, U> implements Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<EndSocket, UserSession_U_4, UserSession_U_7, UserSession_U_2, UserSession_U_3, UserSession_U_6, UserSession_U_5> {
	public static final UserSession_U_1 cast = null;

	protected UserSession_U_1(org.scribble.runtime.session.SessionEndpoint<UserSession, U> se, boolean dummy) {
		super(se);
	}

	public UserSession_U_1(org.scribble.runtime.session.MPSTEndpoint<UserSession, U> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public UserSession_U_1_Cases branch(C role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.C);
		Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum openum;
		if (m.op.equals(UserSession.GetAll)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.GetAll;
		}
		else if (m.op.equals(UserSession.GetOne)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.GetOne;
		}
		else if (m.op.equals(UserSession.Create)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.Create;
		}
		else if (m.op.equals(UserSession.Update)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.Update;
		}
		else if (m.op.equals(UserSession.Replace)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.Replace;
		}
		else if (m.op.equals(UserSession.Delete)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.Delete;
		}
		else if (m.op.equals(UserSession.Bye)) {
			openum = Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum.Bye;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new UserSession_U_1_Cases(this.se, true, openum, m);
	}

	public void branch(C role, UserSession_U_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<EndSocket, UserSession_U_4, UserSession_U_7, UserSession_U_2, UserSession_U_3, UserSession_U_6, UserSession_U_5>) handler);
	}

	@Override
	public void branch(C role, Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<EndSocket, UserSession_U_4, UserSession_U_7, UserSession_U_2, UserSession_U_3, UserSession_U_6, UserSession_U_5> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.C);
		if (m.op.equals(UserSession.GetAll)) {
			handler.receive(new UserSession_U_2(this.se, true), UserSession.GetAll);
		}
		else
		if (m.op.equals(UserSession.GetOne)) {
			handler.receive(new UserSession_U_3(this.se, true), UserSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Create)) {
			handler.receive(new UserSession_U_4(this.se, true), UserSession.Create, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Update)) {
			handler.receive(new UserSession_U_5(this.se, true), UserSession.Update, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[1]));
		}
		else
		if (m.op.equals(UserSession.Replace)) {
			handler.receive(new UserSession_U_6(this.se, true), UserSession.Replace, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[1]));
		}
		else
		if (m.op.equals(UserSession.Delete)) {
			handler.receive(new UserSession_U_7(this.se, true), UserSession.Delete, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Bye)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), UserSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(C role, Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<Succ_In_C_Bye, Succ_In_C_Create_User, Succ_In_C_Delete_Long, Succ_In_C_GetAll, Succ_In_C_GetOne_Long, Succ_In_C_Replace_Long_User, Succ_In_C_Update_Long_User> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(UserSession.C);
		if (m.op.equals(UserSession.GetAll)) {
			handler.receive(new UserSession_U_2(this.se, true), UserSession.GetAll);
		}
		else
		if (m.op.equals(UserSession.GetOne)) {
			handler.receive(new UserSession_U_3(this.se, true), UserSession.GetOne, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Create)) {
			handler.receive(new UserSession_U_4(this.se, true), UserSession.Create, new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Update)) {
			handler.receive(new UserSession_U_5(this.se, true), UserSession.Update, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[1]));
		}
		else
		if (m.op.equals(UserSession.Replace)) {
			handler.receive(new UserSession_U_6(this.se, true), UserSession.Replace, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]), new org.scribble.runtime.util.Buf<>((com.fullcart.dto.UserDTO) m.payload[1]));
		}
		else
		if (m.op.equals(UserSession.Delete)) {
			handler.receive(new UserSession_U_7(this.se, true), UserSession.Delete, new org.scribble.runtime.util.Buf<>((java.lang.Long) m.payload[0]));
		}
		else
		if (m.op.equals(UserSession.Bye)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), UserSession.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}
