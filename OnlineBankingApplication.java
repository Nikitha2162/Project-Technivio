package com.example.onlinebanking.service;

import com.example.onlinebanking.model.Customer;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CustomerService {
    private final Map<Integer, Customer> customerMap = new HashMap<>();

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    public Customer addCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
        return customer;
    }
}
