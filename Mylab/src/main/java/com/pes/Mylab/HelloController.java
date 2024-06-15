package com.pes.Mylab;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value="/myhello")
	private String getMessage1() {
		return "Hello ,how are you";
	}
	@GetMapping(value="/myhello/name/{name}")
	private String getMessage2(@PathVariable String name) {
		return "Hi,i am good what about you: "  +name;
	}
	@GetMapping(value = "/myhello1/name/{name}")
	private Hello getMassage3(@PathVariable String name) {
		return new Hello(1,name,"hi how are you");
	}
	@GetMapping(value = "/hello2/name/{name}",produces = MediaType.APPLICATION_XML_VALUE)
	private Hello getMassage4(@PathVariable String name) {
		return new Hello(1, name, "hi how are you");
	}
}
