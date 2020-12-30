package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_5;

public interface Branch_C_P_Err_String__P_NotFound__P_Ok_Product<__Succ1 extends Succ_In_P_Err_String, __Succ2 extends Succ_In_P_NotFound, __Succ3 extends Succ_In_P_Ok_Product> extends Succ_Out_P_Update_Long_Product {
	Branch_C_P_Err_String__P_NotFound__P_Ok_Product<?, ?, ?> cast = null;

	Case_C_P_Err_String__P_NotFound__P_Ok_Product<__Succ1, __Succ2, __Succ3> branch(P role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(P role, Handle_C_P_Err_String__P_NotFound__P_Ok_Product<__Succ1, __Succ2, __Succ3> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(P role, Handle_C_P_Err_String__P_NotFound__P_Ok_Product<Succ_In_P_Err_String, Succ_In_P_NotFound, Succ_In_P_Ok_Product> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_P_Err_String__P_NotFound__P_Ok_Product<?, ?, ?> to(Branch_C_P_Err_String__P_NotFound__P_Ok_Product<?, ?, ?> cast) {
		return this;
	}

	default ProductSession_C_5 to(ProductSession_C_5 cast) {
		return (ProductSession_C_5) this;
	}

enum Branch_C_P_Err_String__P_NotFound__P_Ok_Product_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, NotFound, Err
}
}
