package com.neosoft.service;


import com.neosoft.model.Customer;
import com.neosoft.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Cacheable(value = "customers", key = "#customerId")
    public Customer findCustomerById(Integer customerId){
        log.info("hitting databse again....");
        return customerRepository.findById(customerId).orElseThrow();
    }

    @CachePut(value = "customers", key = "#customerId")
    public Customer updateCustomer(Integer customerId, Customer customer) {
        customerRepository.updateCustomer(customer.getName(), customer.getOrders(), customerId);
        return customerRepository.findById(customerId).orElseThrow();
    }


//    @CacheEvict(value = "customers", allEntries = true)
    @Cacheable(value = "customers")
    public List<Customer> getAllCustomers() {
        log.info("hitting database again in get all");
        return customerRepository.findAll();
    }
}
