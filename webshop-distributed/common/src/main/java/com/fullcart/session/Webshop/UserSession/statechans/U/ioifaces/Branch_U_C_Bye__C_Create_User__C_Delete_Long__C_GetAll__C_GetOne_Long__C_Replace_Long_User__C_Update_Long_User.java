package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.statechans.U.UserSession_U_1;

public interface Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_User, __Succ3 extends Succ_In_C_Delete_Long, __Succ4 extends Succ_In_C_GetAll, __Succ5 extends Succ_In_C_GetOne_Long, __Succ6 extends Succ_In_C_Replace_Long_User, __Succ7 extends Succ_In_C_Update_Long_User> extends Succ_Out_C_NotFound, Succ_Out_C_Ok_User, Succ_Out_C_Created_User, Succ_Out_C_Ok, Succ_Out_C_Err_String, Succ_Out_C_Ok_List {
	Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<?, ?, ?, ?, ?, ?, ?> cast = null;

	Case_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<__Succ1, __Succ2, __Succ3, __Succ4, __Succ5, __Succ6, __Succ7> branch(C role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(C role, Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<__Succ1, __Succ2, __Succ3, __Succ4, __Succ5, __Succ6, __Succ7> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(C role, Handle_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<Succ_In_C_Bye, Succ_In_C_Create_User, Succ_In_C_Delete_Long, Succ_In_C_GetAll, Succ_In_C_GetOne_Long, Succ_In_C_Replace_Long_User, Succ_In_C_Update_Long_User> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<?, ?, ?, ?, ?, ?, ?> to(Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<?, ?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default UserSession_U_1 to(UserSession_U_1 cast) {
		return (UserSession_U_1) this;
	}

enum Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum implements org.scribble.runtime.session.OpEnum {
	GetAll, GetOne, Create, Update, Replace, Delete, Bye
}
}
