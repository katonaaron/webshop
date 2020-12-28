package com.fullcart.session.Webshop.ProductSession.statechans.C;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class ProductSession_C_4_Future extends org.scribble.runtime.util.ScribFuture {

	protected ProductSession_C_4_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public ProductSession_C_4_Future sync() throws IOException {
		super.get();
		return this;
	}
}