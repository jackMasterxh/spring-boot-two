package com.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ServiceManyDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceManyDatasourceApplication.class, args);
	}

}
