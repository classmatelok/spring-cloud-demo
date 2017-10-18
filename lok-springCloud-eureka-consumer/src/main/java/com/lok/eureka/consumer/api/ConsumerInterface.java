package com.lok.eureka.consumer.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 远程调用接口
 * @date 2017年10月18日
 */
@FeignClient(name="spring-cloud-provider")
public interface ConsumerInterface {
	
	@RequestMapping("/provider")
	public String testProvider(@RequestParam(value = "name") String name);
}
