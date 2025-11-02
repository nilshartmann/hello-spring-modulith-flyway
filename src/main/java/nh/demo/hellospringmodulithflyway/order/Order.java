package nh.demo.hellospringmodulithflyway.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
    @Id
    private String id;
}
