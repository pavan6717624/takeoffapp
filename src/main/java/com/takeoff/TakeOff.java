package com.takeoff;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class TakeOff {

	public static void main(String[] args) {

		SpringApplication.run(TakeOff.class, args);

	}

	@Bean
	public Cloudinary cloudinaryConfig() {

		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "hwlyozehf", "api_key",
				"453395666963287", "api_secret", "Q-kgBVQlRlGtdccq-ATYRFSoR8s"));
		return cloudinary;
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
