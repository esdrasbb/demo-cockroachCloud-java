package com.cockroach.cloud.democockroachCloudjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.cockroach.cloud.democockroachCloudjava.entity.Customer;
import com.cockroach.cloud.democockroachCloudjava.repository.CustomerRepository;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired 
    private CustomerRepository repository;

    public void createCustomer() {
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        logger.info("Saving new customer...");
        this.repository.save(newCustomer);
    }

    public void queryAllCustomers() {
        List<Customer> allCustomers = this.repository.findAll();
        logger.info("Number of customers: " + allCustomers.size());
    }
}