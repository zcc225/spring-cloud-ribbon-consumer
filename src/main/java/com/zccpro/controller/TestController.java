package com.zccpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class TestController {
	@Value(value = "${server.port}")
	String port;
	

	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("hello")
	public String hello() {
//		restTemplate.getForEntity("", String.class).getBody();
		return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
	}
}
