package com.example.xsdPro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.xsdPro.dao")
@EnableScheduling
@EnableCaching
public class XsdProApplication {

	public static void main(String[] args) {
		SpringApplication.run(XsdProApplication.class, args);
	}

}
