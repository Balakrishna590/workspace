package com.demo.spring;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/rest")
public class JaxRSApplication extends ResourceConfig {
	public JaxRSApplication() {
		register(JaxRSResource.class);
	}
	
	
}
