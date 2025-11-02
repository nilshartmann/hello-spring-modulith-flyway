package nh.demo.hellospringmodulithflyway;

import org.springframework.boot.SpringApplication;

public class TestHelloSpringModulithFlywayApplication {

    public static void main(String[] args) {
        SpringApplication.from(HelloSpringModulithFlywayApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
