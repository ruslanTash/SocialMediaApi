package com.example.SocialMediaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSocialMediaApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SocialMediaApiApplication::main).with(TestSocialMediaApiApplication.class).run(args);
	}

}
