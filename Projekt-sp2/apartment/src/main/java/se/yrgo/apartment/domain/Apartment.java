package se.yrgo.apartment.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sq_m;
    private String address;
    private String zipCode;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSq_m() {
        return sq_m;
    }

    public void setSq_m(String sq_m) {
        this.sq_m = sq_m;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
