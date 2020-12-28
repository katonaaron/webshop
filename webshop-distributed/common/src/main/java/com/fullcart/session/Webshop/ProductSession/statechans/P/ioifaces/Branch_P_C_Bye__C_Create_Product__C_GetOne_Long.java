package com.fullcart.session.Webshop.ProductSession.statechans.P.ioifaces;

import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.statechans.P.ProductSession_P_1;

public interface Branch_P_C_Bye__C_Create_Product__C_GetOne_Long<__Succ1 extends Succ_In_C_Bye, __Succ2 extends Succ_In_C_Create_Product, __Succ3 extends Succ_In_C_GetOne_Long> extends Succ_Out_C_One_Product {
	Branch_P_C_Bye__C_Create_Product__C_GetOne_Long<?, ?, ?> cast = null;

	Case_P_C_Bye__C_Create_Product__C_GetOne_Long<__Succ1, __Succ2, __Succ3> branch(C role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(C role, Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<__Succ1, __Succ2, __Succ3> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(C role, Handle_P_C_Bye__C_Create_Product__C_GetOne_Long<Succ_In_C_Bye, Succ_In_C_Create_Product, Succ_In_C_GetOne_Long> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_P_C_Bye__C_Create_Product__C_GetOne_Long<?, ?, ?> to(Branch_P_C_Bye__C_Create_Product__C_GetOne_Long<?, ?, ?> cast) {
		return this;
	}

	default ProductSession_P_1 to(ProductSession_P_1 cast) {
		return (ProductSession_P_1) this;
	}

enum Branch_P_C_Bye__C_Create_Product__C_GetOne_Long_Enum implements org.scribble.runtime.session.OpEnum {
	GetOne, Create, Bye
}
}
