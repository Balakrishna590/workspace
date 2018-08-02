package com.demo.java10;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Main {

	public static void main(String[] args) throws Exception {
		Emp e = new Emp(100, "Shantanu", "Hyderabad", 98000);
		Marshaller m = JAXBContext.newInstance(Emp.class).createMarshaller();
		m.marshal(e, System.out);
	}

}
