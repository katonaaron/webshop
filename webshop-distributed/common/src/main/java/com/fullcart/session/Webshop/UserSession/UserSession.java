package com.fullcart.session.Webshop.UserSession;

import com.fullcart.session.Webshop.UserSession.ops.*;
import com.fullcart.session.Webshop.UserSession.roles.C;
import com.fullcart.session.Webshop.UserSession.roles.U;
import org.scribble.core.type.name.Role;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class UserSession extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("com.fullcart.session.Webshop.UserSession");
	public static final U U = com.fullcart.session.Webshop.UserSession.roles.U.U;
	public static final C C = com.fullcart.session.Webshop.UserSession.roles.C.C;
	public static final Update Update = com.fullcart.session.Webshop.UserSession.ops.Update.Update;
	public static final GetOne GetOne = com.fullcart.session.Webshop.UserSession.ops.GetOne.GetOne;
	public static final Ok Ok = com.fullcart.session.Webshop.UserSession.ops.Ok.Ok;
	public static final Bye Bye = com.fullcart.session.Webshop.UserSession.ops.Bye.Bye;
	public static final Replace Replace = com.fullcart.session.Webshop.UserSession.ops.Replace.Replace;
	public static final GetAll GetAll = com.fullcart.session.Webshop.UserSession.ops.GetAll.GetAll;
	public static final Create Create = com.fullcart.session.Webshop.UserSession.ops.Create.Create;
	public static final Created Created = com.fullcart.session.Webshop.UserSession.ops.Created.Created;
	public static final Err Err = com.fullcart.session.Webshop.UserSession.ops.Err.Err;
	public static final Delete Delete = com.fullcart.session.Webshop.UserSession.ops.Delete.Delete;
	public static final NotFound NotFound = com.fullcart.session.Webshop.UserSession.ops.NotFound.NotFound;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(U, C));

	public UserSession() {
		super(UserSession.IMPATH, UserSession.SOURCE, UserSession.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return UserSession.ROLES;
	}
}
