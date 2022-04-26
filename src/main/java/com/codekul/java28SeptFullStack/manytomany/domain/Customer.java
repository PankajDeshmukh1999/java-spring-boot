package com.codekul.java28SeptFullStack.manytomany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "customer_product",
               joinColumns = {@JoinColumn(name = "customer_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "product_id",referencedColumnName = "id")})
    private List<Product> product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
