package com.takeoff;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class TakeOff {

	public static void main(String[] args) {

		SpringApplication.run(TakeOff.class, args);

	}

	

	@RequestMapping("/")
	public String demo() {
		return "{\"demo\":\"dmeoadsfasdfasd\"}";
	}
	
	  @Bean
	  public Executor taskExecutor() {
	    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	    executor.setCorePoolSize(2);
	    executor.setMaxPoolSize(2);
	    executor.setQueueCapacity(500);
	    executor.setThreadNamePrefix("GithubLookup-");
	    executor.initialize();
	    return executor;
	  }
	
}
