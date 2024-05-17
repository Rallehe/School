package com.yrgo.dataaccess;

import com.yrgo.domain.Call;
import com.yrgo.domain.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerDaoJpaImp implements CustomerDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(Customer customer) {
        System.out.println("Using Jpa");
        em.persist(customer);
    }

    @Override
    public Customer getById(String customerId) throws RecordNotFoundException {
        return (Customer) em.createQuery("select customer from Customer as customer where customer.customerId=:customer_id").setParameter("customer_id", customerId).getSingleResult();
    }

    @Override
    public List<Customer> getByName(String name) {
        return em.createQuery("select customer from Customer as customer where customer.companyName =:name").setParameter("name", name).getResultList();
    }

    @Override
    public void update(Customer customerToUpdate) throws RecordNotFoundException {
        em.createQuery("update Customer as c SET c.companyName = :companyName, c.email = :email, c.telephone = :telephone, c.notes = :notes WHERE c.customerId = :customerToUpdate")
                .setParameter("customerToUpdate", customerToUpdate.getCustomerId())
                .setParameter("companyName", customerToUpdate.getCompanyName())
                .setParameter("email", customerToUpdate.getEmail())
                .setParameter("telephone", customerToUpdate.getTelephone())
                .setParameter("notes", customerToUpdate.getNotes())
                .executeUpdate();
    }

    @Override
    public void delete(Customer oldCustomer) throws RecordNotFoundException {
        Customer customer = em.find(Customer.class, oldCustomer.getCustomerId());
        em.remove(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return em.createQuery("select customer from Customer as customer").getResultList();
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws RecordNotFoundException {
        return (Customer) em.createQuery("select c from Customer as c left join fetch c.calls where c.customerId=:customer_id")
                .setParameter("customer_id", customerId)
                .getSingleResult();
    }

    @Override
    public void addCall(Call newCall, String customerId) throws RecordNotFoundException {
        em.createQuery("UPDATE Customer as c SET c.calls =: newCall where c.customerId =: customerId")
                .setParameter("customerId", customerId)
                .setParameter("newCall", newCall);
    }
}
