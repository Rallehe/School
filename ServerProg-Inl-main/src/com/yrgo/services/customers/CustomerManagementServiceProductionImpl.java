package com.yrgo.services.customers;

import com.yrgo.dataaccess.CustomerDao;
import com.yrgo.dataaccess.RecordNotFoundException;
import com.yrgo.domain.Call;
import com.yrgo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("customerService")
public class CustomerManagementServiceProductionImpl implements CustomerManagementService {
    @Autowired
    private CustomerDao customerDao;

//    public CustomerManagementServiceProductionImpl(CustomerDao customerDao) {
//        this.customerDao = customerDao;
//    }

    @Override
    public void newCustomer(Customer newCustomer) {
        this.customerDao.create(newCustomer);
    }

    @Override
    public void updateCustomer(Customer changedCustomer) throws CustomerNotFoundException {
        try {
            this.customerDao.update(changedCustomer);
        } catch (RecordNotFoundException e) {
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public void deleteCustomer(Customer oldCustomer) throws CustomerNotFoundException {
        try {
            this.customerDao.delete(oldCustomer);
        } catch (RecordNotFoundException e) {
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
        try {
            return this.customerDao.getById(customerId);
        } catch (RecordNotFoundException e) {
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        return this.customerDao.getByName(name);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.customerDao.getAllCustomers();
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
        try {
            return this.customerDao.getFullCustomerDetail(customerId);
        } catch (RecordNotFoundException e) {
            throw new CustomerNotFoundException();
        }
    }

    @Override
    public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
        try {
            this.customerDao.addCall(callDetails, customerId);
        } catch (RecordNotFoundException e) {
            throw new CustomerNotFoundException();
        }
    }
}
