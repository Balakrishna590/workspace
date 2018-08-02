package com.demo.mymodule1;

import java.util.Random;

public class GreetProvider {
String[] messages= {"Greeting","Good Morning","Good day"};
	public String getGreetingMessage() {
		Random rnd=new Random();
		return messages[rnd.nextInt(3)];
	}
}
