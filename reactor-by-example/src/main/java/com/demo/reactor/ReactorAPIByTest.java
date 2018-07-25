package com.demo.reactor;

import java.time.Duration;

import org.junit.Test;

import reactor.core.publisher.Flux;

public class ReactorAPIByTest {

	@Test
	public void testFluxGenerate() {

		Flux<String> flux = Flux.generate(() -> 0, (state, sink) -> {
			sink.next("3 x " + state + " = " + 3 * state);
			if (state == 10)
				sink.complete();
			return state + 1;
		});
		flux.subscribe(System.out::println);
	}

	@Test
	public void testFluxGenerate2() {

		Flux<String> nameFlux = Flux.generate(() -> 0, (state, sink) -> {
			sink.next("hi");
			if (state == 20)
				sink.complete();
			return state + 1;
		});
		nameFlux.delay(Duration.ofSeconds(2)).subscribe(System.out::println);
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
