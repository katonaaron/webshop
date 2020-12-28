package com.fullcart.session.Webshop.ProductSession;

import com.fullcart.session.Webshop.ProductSession.ops.Bye;
import com.fullcart.session.Webshop.ProductSession.ops.Create;
import com.fullcart.session.Webshop.ProductSession.ops.GetOne;
import com.fullcart.session.Webshop.ProductSession.ops.One;
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
	public static final GetOne GetOne = com.fullcart.session.Webshop.ProductSession.ops.GetOne.GetOne;
	public static final Bye Bye = com.fullcart.session.Webshop.ProductSession.ops.Bye.Bye;
	public static final One One = com.fullcart.session.Webshop.ProductSession.ops.One.One;
	public static final Create Create = com.fullcart.session.Webshop.ProductSession.ops.Create.Create;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(P, C));

	public ProductSession() {
		super(ProductSession.IMPATH, ProductSession.SOURCE, ProductSession.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return ProductSession.ROLES;
	}
}
