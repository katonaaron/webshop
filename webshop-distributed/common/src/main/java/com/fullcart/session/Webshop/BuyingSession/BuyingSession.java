package com.fullcart.session.Webshop.BuyingSession;

import com.fullcart.session.Webshop.BuyingSession.ops.*;
import com.fullcart.session.Webshop.BuyingSession.roles.B;
import com.fullcart.session.Webshop.BuyingSession.roles.C;
import com.fullcart.session.Webshop.BuyingSession.roles.P;
import com.fullcart.session.Webshop.BuyingSession.roles.U;
import org.scribble.core.type.name.Role;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class BuyingSession extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("com.fullcart.session.Webshop.BuyingSession");
	public static final P P = com.fullcart.session.Webshop.BuyingSession.roles.P.P;
	public static final U U = com.fullcart.session.Webshop.BuyingSession.roles.U.U;
	public static final B B = com.fullcart.session.Webshop.BuyingSession.roles.B.B;
	public static final C C = com.fullcart.session.Webshop.BuyingSession.roles.C.C;
	public static final GetOne GetOne = com.fullcart.session.Webshop.BuyingSession.ops.GetOne.GetOne;
	public static final Ok Ok = com.fullcart.session.Webshop.BuyingSession.ops.Ok.Ok;
	public static final Bye Bye = com.fullcart.session.Webshop.BuyingSession.ops.Bye.Bye;
	public static final NotAllowed NotAllowed = com.fullcart.session.Webshop.BuyingSession.ops.NotAllowed.NotAllowed;
	public static final GetAll GetAll = com.fullcart.session.Webshop.BuyingSession.ops.GetAll.GetAll;
	public static final Create Create = com.fullcart.session.Webshop.BuyingSession.ops.Create.Create;
	public static final All All = com.fullcart.session.Webshop.BuyingSession.ops.All.All;
	public static final ProductNotFound ProductNotFound = com.fullcart.session.Webshop.BuyingSession.ops.ProductNotFound.ProductNotFound;
	public static final NotFound NotFound = com.fullcart.session.Webshop.BuyingSession.ops.NotFound.NotFound;
	public static final Cancel Cancel = com.fullcart.session.Webshop.BuyingSession.ops.Cancel.Cancel;
	public static final Complete Complete = com.fullcart.session.Webshop.BuyingSession.ops.Complete.Complete;
	public static final UserNotFound UserNotFound = com.fullcart.session.Webshop.BuyingSession.ops.UserNotFound.UserNotFound;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(P, U, B, C));

	public BuyingSession() {
		super(BuyingSession.IMPATH, BuyingSession.SOURCE, BuyingSession.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return BuyingSession.ROLES;
	}
}
