package com.rest.customer.repository;

import com.rest.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CustomerRepository extends JpaRepository<Customer,Long> {

}
