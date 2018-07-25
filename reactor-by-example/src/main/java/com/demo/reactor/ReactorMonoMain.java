package com.demo.reactor;

import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactorMonoMain {

	public static void main(String[] args) {
		Mono<String> greet=Mono.just("Hi, This is Reactor App");
		
		greet.subscribe(System.out::println);
		
		List<String> words=Arrays.asList("One","Two","Three","Four","Five");
		Flux<String> data=Flux.fromIterable(words);
		data.
		flatMap(s->Mono.just(s+"hi")).log().subscribe(System.out::println);
		

	}

}
