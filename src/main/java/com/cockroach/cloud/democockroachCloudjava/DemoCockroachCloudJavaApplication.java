package com.cockroach.cloud.democockroachCloudjava;

import com.cockroach.cloud.democockroachCloudjava.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoCockroachCloudJavaApplication {

	@Autowired
	private CustomerService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoCockroachCloudJavaApplication.class, args);
	}

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        service.queryAllCustomers();
        service.createCustomer();
        service.queryAllCustomers();
    }

}
