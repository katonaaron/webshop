package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.NotFound;
import com.fullcart.session.Webshop.BuyingSession.ops.Ok;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Branch_B_U_NotFound_Long__U_Ok_User;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Case_B_U_NotFound_Long__U_Ok_User;

public final class BuyingSession_B_5_Cases extends org.scribble.runtime.statechans.CaseSocket<BuyingSession, B> implements Case_B_U_NotFound_Long__U_Ok_User<BuyingSession_B_10, BuyingSession_B_6> {
	public static final BuyingSession_B_5_Cases cast = null;
	public final BuyingSession_B_5.Branch_B_U_NotFound_Long__U_Ok_User_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected BuyingSession_B_5_Cases(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy, BuyingSession_B_5.Branch_B_U_NotFound_Long__U_Ok_User_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public BuyingSession_B_6 receive(U role, Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Ok)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.UserDTO) m.payload[0];
		return new BuyingSession_B_6(this.se, true);
	}

	public BuyingSession_B_6 receive(Ok op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.UserDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.U, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_6 receive(Ok op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.UserDTO>) this.se.gc);
	}

	public BuyingSession_B_10 receive(U role, NotFound op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.NotFound)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new BuyingSession_B_10(this.se, true);
	}

	public BuyingSession_B_10 receive(NotFound op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.U, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_10 receive(NotFound op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	@Override
	public Branch_B_U_NotFound_Long__U_Ok_User.Branch_B_U_NotFound_Long__U_Ok_User_Enum getOp() {
		return this.op;
	}
}
