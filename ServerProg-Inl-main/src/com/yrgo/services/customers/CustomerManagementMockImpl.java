package com.yrgo.services.customers;

import com.yrgo.domain.Call;
import com.yrgo.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Transactional
public class CustomerManagementMockImpl implements CustomerManagementService {

    private HashMap<String, Customer> customerMap;

    public CustomerManagementMockImpl() {
        customerMap = new HashMap<String, Customer>();
        customerMap.put("OB74", new Customer("OB74", "Fargo Ltd", "some notes"));
        customerMap.put("NV10", new Customer("NV10", "North Ltd", "some other notes"));
        customerMap.put("RM210", new Customer("RM210", "River Ltd", "some more notes"));
    }


    @Override
    public void newCustomer(Customer newCustomer) {
        customerMap.put(newCustomer.getCustomerId(), newCustomer);
    }

    @Override
    public void updateCustomer(Customer changedCustomer) {
        customerMap.replace(changedCustomer.getCustomerId(), changedCustomer);

    }

    @Override
    public void deleteCustomer(Customer oldCustomer) {
        customerMap.remove(oldCustomer.getCustomerId());
    }

    @Override
    public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
        return customerMap.get(customerId);
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : customerMap.values()) {
            customers.add(customerMap.get(name));
        }
        return customers;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<Customer>(customerMap.values());
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
		return null;
    }

    @Override
    public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
        //First find the customer
        Customer customer = customerMap.get(customerId);
        //Call the addCall on the customer
        customer.addCall(callDetails);
    }

}
