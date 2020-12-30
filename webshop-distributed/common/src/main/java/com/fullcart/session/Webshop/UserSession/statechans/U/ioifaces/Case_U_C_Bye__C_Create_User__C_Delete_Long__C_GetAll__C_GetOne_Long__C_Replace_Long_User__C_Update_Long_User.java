package com.fullcart.session.Webshop.UserSession.statechans.U.ioifaces;

import com.fullcart.session.Webshop.UserSession.ops.*;

public interface Case_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_User, __Succ3 extends Succ_In_C_Delete_Long, __Succ4 extends Succ_In_C_GetAll, __Succ5 extends Succ_In_C_GetOne_Long, __Succ6 extends Succ_In_C_Replace_Long_User, __Succ7 extends Succ_In_C_Update_Long_User> extends In_C_Bye<__Succ1>, In_C_Create_User<__Succ2>, In_C_Delete_Long<__Succ3>, In_C_GetAll<__Succ4>, In_C_GetOne_Long<__Succ5>, In_C_Replace_Long_User<__Succ6>, In_C_Update_Long_User<__Succ7> {
	Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User<?, ?, ?, ?, ?, ?, ?> cast = null;

	Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User.Branch_U_C_Bye__C_Create_User__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_User__C_Update_Long_User_Enum getOp();

	com.fullcart.session.Webshop.UserSession.statechans.U.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ2 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ3 receive(Delete op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ4 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ5 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ6 receive(Replace op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	__Succ7 receive(Update op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}
