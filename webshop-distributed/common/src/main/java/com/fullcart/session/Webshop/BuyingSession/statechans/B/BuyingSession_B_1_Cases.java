package com.fullcart.session.Webshop.BuyingSession.statechans.B;

import com.fullcart.session.Webshop.BuyingSession.BuyingSession;
import com.fullcart.session.Webshop.BuyingSession.ops.*;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long;
import com.fullcart.session.Webshop.BuyingSession.statechans.B.ioifaces.Case_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long;

public final class BuyingSession_B_1_Cases extends org.scribble.runtime.statechans.CaseSocket<BuyingSession, B> implements Case_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long<BuyingSession_B_13, BuyingSession_B_11, BuyingSession_B_12, BuyingSession_B_4, BuyingSession_B_2, BuyingSession_B_3> {
	public static final BuyingSession_B_1_Cases cast = null;
	public final BuyingSession_B_1.Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected BuyingSession_B_1_Cases(org.scribble.runtime.session.SessionEndpoint<BuyingSession, B> se, boolean dummy, BuyingSession_B_1.Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public BuyingSession_B_2 receive(C role, GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.GetAll)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new BuyingSession_B_2(this.se, true);
	}

	public BuyingSession_B_2 receive(GetAll op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.C, op);
	}

	public BuyingSession_B_3 receive(C role, GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.GetOne)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new BuyingSession_B_3(this.se, true);
	}

	public BuyingSession_B_3 receive(GetOne op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_3 receive(GetOne op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public BuyingSession_B_4 receive(C role, Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Create)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (com.fullcart.dto.OrderDTO) m.payload[0];
		return new BuyingSession_B_4(this.se, true);
	}

	public BuyingSession_B_4 receive(Create op, org.scribble.runtime.util.Buf<? super com.fullcart.dto.OrderDTO> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_4 receive(Create op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<com.fullcart.dto.OrderDTO>) this.se.gc);
	}

	public BuyingSession_B_11 receive(C role, Cancel op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Cancel)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new BuyingSession_B_11(this.se, true);
	}

	public BuyingSession_B_11 receive(Cancel op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_11 receive(Cancel op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public BuyingSession_B_12 receive(C role, Complete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Complete)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Long) m.payload[0];
		return new BuyingSession_B_12(this.se, true);
	}

	public BuyingSession_B_12 receive(Complete op, org.scribble.runtime.util.Buf<? super java.lang.Long> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.C, op, arg1);
	}

	@SuppressWarnings("unchecked")
	public BuyingSession_B_12 receive(Complete op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Long>) this.se.gc);
	}

	public BuyingSession_B_13 receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(BuyingSession.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		return new BuyingSession_B_13(this.se, true);
	}

	public BuyingSession_B_13 receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(BuyingSession.C, op);
	}

	@Override
	public Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long.Branch_B_C_Bye__C_Cancel_Long__C_Complete_Long__C_Create_Order__C_GetAll__C_GetOne_Long_Enum getOp() {
		return this.op;
	}
}
