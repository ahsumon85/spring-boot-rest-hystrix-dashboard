package com.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class SpringBootRestCurdApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCurdApplication.class, args);
		System.out.println("Hystrix monitoring dashborad application running......");
	}

}
