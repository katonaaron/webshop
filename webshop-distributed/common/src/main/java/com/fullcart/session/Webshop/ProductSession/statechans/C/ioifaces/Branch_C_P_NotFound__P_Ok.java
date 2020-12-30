package com.fullcart.session.Webshop.ProductSession.statechans.C.ioifaces;

import com.fullcart.session.Webshop.ProductSession.roles.P;
import com.fullcart.session.Webshop.ProductSession.statechans.C.ProductSession_C_7;

public interface Branch_C_P_NotFound__P_Ok<__Succ1 extends Succ_In_P_NotFound, __Succ2 extends Succ_In_P_Ok> extends Succ_Out_P_Delete_Long {
	Branch_C_P_NotFound__P_Ok<?, ?> cast = null;

	Case_C_P_NotFound__P_Ok<__Succ1, __Succ2> branch(P role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void branch(P role, Handle_C_P_NotFound__P_Ok<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	void handle(P role, Handle_C_P_NotFound__P_Ok<Succ_In_P_NotFound, Succ_In_P_Ok> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_C_P_NotFound__P_Ok<?, ?> to(Branch_C_P_NotFound__P_Ok<?, ?> cast) {
		return this;
	}

	default ProductSession_C_7 to(ProductSession_C_7 cast) {
		return (ProductSession_C_7) this;
	}

enum Branch_C_P_NotFound__P_Ok_Enum implements org.scribble.runtime.session.OpEnum {
	Ok, NotFound
}
}
