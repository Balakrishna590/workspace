package com.demo.jaxrs;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class MyRestApplication extends ResourceConfig {
	public MyRestApplication() {
		packages("com.demo.jaxrs");
	}
}
