package com.ondemandcarwash.DiscoveryServer;

import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {
	public static final Logger LOG = LoggerFactory.getLogger(DiscoveryServerApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
		ZonedDateTime now = ZonedDateTime.now();
		LOG.info("----Server started----"+now);
	}

}
