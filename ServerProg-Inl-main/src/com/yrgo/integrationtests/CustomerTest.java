package com.yrgo.integrationtests;

import com.yrgo.dataaccess.RecordNotFoundException;
import com.yrgo.domain.Customer;
import com.yrgo.services.customers.CustomerManagementService;
import com.yrgo.services.customers.CustomerNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration({"/other-tiers.xml", "/datasource-test.xml"})
@Transactional
public class CustomerTest {

    @Autowired
    private CustomerManagementService customerService;

    @Test
    public void creatingCustomer() {
        customerService.newCustomer(new Customer("CS03939", "Acme", "Good Customer"));
        customerService.newCustomer(new Customer("CS03938", "Acma", "Bad Customer"));
        int customerSize = customerService.getAllCustomers().size();
        assertEquals(2, customerSize, "There should be two customers in the database!");
    }

    @Test
    public void findCustomer() throws RecordNotFoundException, CustomerNotFoundException {
        Customer newCustomer = new Customer("CS03939", "Acme", "Good Customer");
        customerService.newCustomer(newCustomer);
        Customer foundCustomer = customerService.findCustomerById("CS03939");
        assertEquals(newCustomer, foundCustomer);
    }
}
