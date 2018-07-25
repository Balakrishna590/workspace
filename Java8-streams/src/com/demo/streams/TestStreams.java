package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class TestStreams {

	@Test
	public void testStreams1() {
		List<String> names = Arrays.asList("Pinky", "Nolan", "Jim", "Kiran", "Gopal", "Charu");
		names.stream().forEach(System.out::println);
	}

	@Test
	public void testStreams2() {
		List<String> names = Arrays.asList("Pinki", "Nolan", "Jim", "Kiran", "Gopal", "Charu");
		names.stream().filter(s -> s.contains("i")).forEach(System.out::println);
		;
	}

	@Test
	public void testStreams3() {
		List<String> names = Arrays.asList("Pinki", "Nolan", "Jim", "Kiran", "Gopal", "Charu");
		long count = names.stream().filter(s -> s.contains("i")).count();
		System.out.println(count);
	}

	@Test
	public void testBiConsumer() {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key:" + key + " Value:" + value);
		map.forEach(biConsumer);
	}
	
	@Test
	public void testBiFunction() {
		 BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" +(num1 + num2);
	        System.out.println(biFunction.apply(20,25));
	}
	
	@Test
	public void testBiPredicate() {
		BiPredicate<Integer, String> condition = (i,s)-> i>20 && s.startsWith("R");
	      System.out.println(condition.test(10,"Ram"));
	      System.out.println(condition.test(30,"Shyam"));
	      System.out.println(condition.test(30,"Ram"));
	}
	
	@Test
	public void testSupplier1() {
		
		 List<Item> list = new ArrayList<>();
	        list.add(new Item("AA"));
	        list.add(new Item("BB"));
	        list.add(new Item("CC"));
	        Stream<String> names = list.stream().map(Item::getName);
	        names.forEach(n -> System.out.println(n));
	}
	
	@Test
	public void testSupplier2() {
		Supplier<Item> supplier = Item::new;
        Item item = supplier.get();
        System.out.println(item.getMsg());
	}
	
	@Test
	public void testSupplier3() {
		List<Item> list = new ArrayList<>();
        list.add(new Item("AA"));
        list.add(new Item("BB"));
        list.add(new Item("CC"));
        Stream<String> names = list.stream().map(Item::getName);
        names.forEach(n -> System.out.println(n));
	}
	
}
