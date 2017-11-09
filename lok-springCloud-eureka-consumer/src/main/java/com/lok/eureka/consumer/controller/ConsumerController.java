package com.lok.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lok.eureka.consumer.api.ConsumerInterface;

/**
 * @Description 消费服务类
 * @date 2017年10月18日
 */
@RestController
@RequestMapping
public class ConsumerController {
	
	@Autowired
	private ConsumerInterface consumerInterface;
	
	@RequestMapping(value="/consumer/{name}", method=RequestMethod.GET)
//	@GetMapping("/consumer/{name}") //相当于上行的简写，还有@PostMapping、@DeleteMapping、@PutMapping等，是spring4.3之后引入的
	public String testProvider(@PathVariable("name") String name) {
		return consumerInterface.testProvider(name);
	}
}
