package com.rest.customer.service;

import com.rest.customer.model.Customer;
import java.util.List;

public interface CustomerService {

  Customer getById(Long id);
  void save(Customer customer);
  void delete(Long id);
  List<Customer> getAll();
}
