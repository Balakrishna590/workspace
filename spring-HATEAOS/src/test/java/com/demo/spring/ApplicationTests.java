package com.demo.spring;

import org.junit.Test;
import org.springframework.hateoas.Link;

import com.fasterxml.jackson.databind.ObjectMapper;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class ApplicationTests {

	@Test
	public void testLinks() {
		Link link = new Link("http://localhost:8080/something");
		//assertThat(link.getHref(), is("http://localhost:8080/something"));
		//assertThat(link.getRel(), is(Link.REL_SELF));

		Link link1 = new Link("http://localhost:8080/something", "my-rel");
		//assertThat(link1.getHref(), is("http://localhost:8080/something"));
		//assertThat(link1.getRel(), is("my-rel"));
		System.out.println(link1);
	}
	
	@Test
	public void testLinksJSON() throws Exception {
		PersonResource resource = new PersonResource();
		resource.firstname = "Dave";
		resource.lastname = "Matthews";
		resource.add(new Link("http://myhost/people"));
		
		ObjectMapper mapper=new ObjectMapper();
		System.out.println(mapper.writeValueAsString(resource));
	}

}
