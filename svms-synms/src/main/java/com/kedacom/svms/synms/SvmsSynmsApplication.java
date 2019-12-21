package com.kedacom.svms.synms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ComponentScan(basePackages = {"com.kedacom.svms"})
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SvmsSynmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvmsSynmsApplication.class, args);
	}

}
