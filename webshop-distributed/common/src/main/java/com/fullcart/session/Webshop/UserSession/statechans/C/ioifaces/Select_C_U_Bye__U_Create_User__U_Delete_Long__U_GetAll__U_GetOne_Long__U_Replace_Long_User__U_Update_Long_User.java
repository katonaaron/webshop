package com.fullcart.session.Webshop.UserSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.UserSession.statechans.C.UserSession_C_1;

public interface Select_C_U_Bye__U_Create_User__U_Delete_Long__U_GetAll__U_GetOne_Long__U_Replace_Long_User__U_Update_Long_User<__Succ1 extends Succ_Out_U_Bye, __Succ2 extends Succ_Out_U_Create_User, __Succ3 extends Succ_Out_U_Delete_Long, __Succ4 extends Succ_Out_U_GetAll, __Succ5 extends Succ_Out_U_GetOne_Long, __Succ6 extends Succ_Out_U_Replace_Long_User, __Succ7 extends Succ_Out_U_Update_Long_User> extends Out_U_Bye<__Succ1>, Out_U_Create_User<__Succ2>, Out_U_Delete_Long<__Succ3>, Out_U_GetAll<__Succ4>, Out_U_GetOne_Long<__Succ5>, Out_U_Replace_Long_User<__Succ6>, Out_U_Update_Long_User<__Succ7>, Succ_In_U_Ok_User, Succ_In_U_Err_String, Succ_In_U_Ok_List, Succ_In_U_Created_User, Succ_In_U_NotFound, Succ_In_U_Ok {
	Select_C_U_Bye__U_Create_User__U_Delete_Long__U_GetAll__U_GetOne_Long__U_Replace_Long_User__U_Update_Long_User<?, ?, ?, ?, ?, ?, ?> cast = null;

	@Override
	default Select_C_U_Bye__U_Create_User__U_Delete_Long__U_GetAll__U_GetOne_Long__U_Replace_Long_User__U_Update_Long_User<?, ?, ?, ?, ?, ?, ?> to(Select_C_U_Bye__U_Create_User__U_Delete_Long__U_GetAll__U_GetOne_Long__U_Replace_Long_User__U_Update_Long_User<?, ?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default UserSession_C_1 to(UserSession_C_1 cast) {
		return (UserSession_C_1) this;
	}
}
