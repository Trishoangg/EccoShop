package com.eccoshop.library.service;

import com.eccoshop.library.dto.CustomerDto;
import com.eccoshop.library.model.Customer;

public interface CustomerService {
    Customer save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer update(CustomerDto customerDto);

    Customer changePass(CustomerDto customerDto);

    CustomerDto getCustomer(String username);
}
