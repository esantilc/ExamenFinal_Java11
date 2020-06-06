package org.jaed.bdthyymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("org.jaed.bdthyymeleaf.proxy")
@EnableDiscoveryClient
@SpringBootApplication
public class BdThyymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdThyymeleafApplication.class, args);
	}

}
