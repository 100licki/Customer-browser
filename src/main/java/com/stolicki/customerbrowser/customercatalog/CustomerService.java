package com.stolicki.customerbrowser.customercatalog;

import java.util.List;

@org.springframework.stereotype.Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.getById(id);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer editCustomer(Long id, Customer customer) {
        Customer editedCustomer = this.getCustomerById(id);
//        editedCustomer.setId(id);
        editedCustomer.setFirstName(customer.getFirstName());
        editedCustomer.setLastName(customer.getLastName());
        editedCustomer.setEmail(customer.getEmail());
        editedCustomer.setPhoneNumber(customer.getPhoneNumber());
        editedCustomer.setAddress(customer.getAddress());
        editedCustomer.setAdditionalInformation(customer.getAdditionalInformation());
        return editedCustomer;
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }
}
