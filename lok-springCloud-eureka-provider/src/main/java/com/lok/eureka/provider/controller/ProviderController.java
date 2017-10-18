package com.lok.eureka.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 提供服务
 * @date 2017年10月18日
 */
@RestController
@RequestMapping
public class ProviderController {
	
	@RequestMapping("/provider")
	public String testProvider(@RequestParam("name") String name) {
		System.out.println("provider OK!");
		return "Spring Cloud demo success!name:"+ name;
	}
}
