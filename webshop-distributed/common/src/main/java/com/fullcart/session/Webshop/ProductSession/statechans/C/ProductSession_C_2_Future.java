package com.fullcart.session.Webshop.ProductSession.statechans.C;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class ProductSession_C_2_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Iterable pay1;

	protected ProductSession_C_2_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public ProductSession_C_2_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Iterable) m.payload[0];
		return this;
	}
}