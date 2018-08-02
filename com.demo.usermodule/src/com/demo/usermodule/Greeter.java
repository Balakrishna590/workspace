package com.demo.usermodule;

import com.demo.mymodule1.GreetProvider;

public class Greeter {

	public static void main(String[] args) {
		
		GreetProvider provider=new GreetProvider();
		System.out.println(provider.getGreetingMessage());

	}

}
