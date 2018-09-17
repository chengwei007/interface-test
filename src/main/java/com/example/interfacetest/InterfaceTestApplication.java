package com.example.interfacetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@MapperScan("com.example.interfacetest.dao")
@SpringBootApplication(scanBasePackages = {"com.example.interfacetest"})
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.example.interfacetest"})
public class InterfaceTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(InterfaceTestApplication.class, args);
	}
}
