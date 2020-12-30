package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_1;

public interface Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_Product, __Succ3 extends Succ_In_C_Delete_Long, __Succ4 extends Succ_In_C_GetAll, __Succ5 extends Succ_In_C_GetOne_Long, __Succ6 extends Succ_In_C_Replace_Long_Product, __Succ7 extends Succ_In_C_Update_Long_Product> extends Succ_Out_C_Ok, Succ_Out_C_Err_String, Succ_Out_C_Ok_Product, Succ_Out_C_Ok_List, Succ_Out_C_Created_Product, Succ_Out_C_NotFound {
	Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<?, ?, ?, ?, ?, ?, ?> cast = null;

	Case_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<__Succ1, __Succ2, __Succ3, __Succ4, __Succ5, __Succ6, __Succ7> branch(C role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(C role, Handle_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<__Succ1, __Succ2, __Succ3, __Succ4, __Succ5, __Succ6, __Succ7> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(C role, Handle_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<Succ_In_C_Bye, Succ_In_C_Create_Product, Succ_In_C_Delete_Long, Succ_In_C_GetAll, Succ_In_C_GetOne_Long, Succ_In_C_Replace_Long_Product, Succ_In_C_Update_Long_Product> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<?, ?, ?, ?, ?, ?, ?> to(Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product<?, ?, ?, ?, ?, ?, ?> cast) {
		return this;
	}

	default ProductSession_P_1 to(ProductSession_P_1 cast) {
		return (ProductSession_P_1) this;
	}

enum Branch_P_C_Bye__C_Create_Product__C_Delete_Long__C_GetAll__C_GetOne_Long__C_Replace_Long_Product__C_Update_Long_Product_Enum implements org.scribble.runtime.session.OpEnum {
	GetAll, GetOne, Create, Update, Replace, Delete, Bye
}
}
