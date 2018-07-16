package com.retail.ecom.eureka.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@SpringBootApplication(scanBasePackages={"com.retail"})
@EnableEurekaServer
public class EurekaServerApplication {
	

	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
