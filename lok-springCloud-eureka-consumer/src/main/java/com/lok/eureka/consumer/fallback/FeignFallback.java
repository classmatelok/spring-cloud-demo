package com.lok.eureka.consumer.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.lok.eureka.consumer.api.ConsumerInterface;

/**
 * @Description 熔断回调类
 * @date 2017年10月20日
 */
@Component
public class FeignFallback implements ConsumerInterface {

	@Override
	public String testProvider(@RequestParam("name") String name) {
		return "sorry, your request failed, name is: " + name;
	}
	
}
