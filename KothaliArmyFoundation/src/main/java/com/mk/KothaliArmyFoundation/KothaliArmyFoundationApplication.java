package com.mk.KothaliArmyFoundation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.mk.KothaliArmyFoundationController","com.mk.KothaliArmyFoundationServices","com.mk.KothaliArmyFoundationBO"})
@ComponentScan(value = "com.mk.KothaliArmyFoundationServices")
public class KothaliArmyFoundationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KothaliArmyFoundationApplication.class, args);
	}
}
