package com.cockroach.cloud.democockroachCloudjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cockroach.cloud.democockroachCloudjava.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}