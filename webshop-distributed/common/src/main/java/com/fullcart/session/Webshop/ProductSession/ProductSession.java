package com.fullcart.session.Webshop.ProductSession;

import com.fullcart.session.Webshop.ProductSession.ops.*;
import com.fullcart.session.Webshop.ProductSession.roles.C;
import com.fullcart.session.Webshop.ProductSession.roles.P;
import org.scribble.core.type.name.Role;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class ProductSession extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("com.fullcart.session.Webshop.ProductSession");
	public static final P P = com.fullcart.session.Webshop.ProductSession.roles.P.P;
	public static final C C = com.fullcart.session.Webshop.ProductSession.roles.C.C;
	public static final Update Update = com.fullcart.session.Webshop.ProductSession.ops.Update.Update;
	public static final GetOne GetOne = com.fullcart.session.Webshop.ProductSession.ops.GetOne.GetOne;
	public static final Ok Ok = com.fullcart.session.Webshop.ProductSession.ops.Ok.Ok;
	public static final Bye Bye = com.fullcart.session.Webshop.ProductSession.ops.Bye.Bye;
	public static final Replace Replace = com.fullcart.session.Webshop.ProductSession.ops.Replace.Replace;
	public static final GetAll GetAll = com.fullcart.session.Webshop.ProductSession.ops.GetAll.GetAll;
	public static final Create Create = com.fullcart.session.Webshop.ProductSession.ops.Create.Create;
	public static final Created Created = com.fullcart.session.Webshop.ProductSession.ops.Created.Created;
	public static final Err Err = com.fullcart.session.Webshop.ProductSession.ops.Err.Err;
	public static final Delete Delete = com.fullcart.session.Webshop.ProductSession.ops.Delete.Delete;
	public static final NotFound NotFound = com.fullcart.session.Webshop.ProductSession.ops.NotFound.NotFound;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(P, C));

	public ProductSession() {
		super(ProductSession.IMPATH, ProductSession.SOURCE, ProductSession.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return ProductSession.ROLES;
	}
}
