package nh.demo.hellospringmodulithflyway.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    private String id;

}
