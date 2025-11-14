package nh.demo.hellospringmodulithflyway.order;

import nh.demo.hellospringmodulithflyway.customer.Customer;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void newOrder(Customer c) {
        System.out.println("new order for " + c);
    }

}
