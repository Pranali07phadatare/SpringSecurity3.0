package com.neosoft.service;


import com.neosoft.model.Customer;
import com.neosoft.model.User;
import com.neosoft.repository.CustomerRepository;
import com.neosoft.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User createCustomer(User customer) {

        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return userRepository.save(customer);
    }


}
