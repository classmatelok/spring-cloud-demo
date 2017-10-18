package com.lok.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lok.eureka.consumer.api.ConsumerInterface;

/**
 * @Description 提供服务
 * @date 2017年10月18日
 */
@RestController
@RequestMapping
public class ConsumerController {
	
	@Autowired
	private ConsumerInterface consumerInterface;
	
	@RequestMapping("/consumer/{name}")
	public String testProvider(@PathVariable("name") String name) {
		return consumerInterface.testProvider(name);
	}
}
