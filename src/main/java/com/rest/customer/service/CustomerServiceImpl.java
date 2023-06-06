package com.rest.customer.service;

import com.rest.customer.model.Customer;
import com.rest.customer.repository.CustomerRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

  @Autowired
  CustomerRepository customerRepository;
  @Override
  public Customer getById(Long id) {
    log.info("IN CustomerServiceImpl getById {}",id);
    return customerRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Customer customer) {
    log.info("IN CustomerServiceImpl save {}",customer);

    customerRepository.save(customer);
  }

  @Override
  public void delete(Long id) {
    log.info("IN CustomerServiceImpl delete {}",id);
    Customer customer=customerRepository.findById(id).orElse(null);
    if (customer !=null) {
      customerRepository.delete(customer);
    }
  }

  @Override
  public List<Customer> getAll() {
    log.info("IN CustomerServiceImpl getAll");
    return customerRepository.findAll();
  }
}
