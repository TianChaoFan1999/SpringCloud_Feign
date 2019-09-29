package com.tcf.cloud.feign.provider.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * TODO TCF Feign服务提供者启动类
 * @author 71485
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.tcf.cloud.feign.provider.demo"})
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FeignProviderApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FeignProviderApplication.class,args);
	}
	
}
