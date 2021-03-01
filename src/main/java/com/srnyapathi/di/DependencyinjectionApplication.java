package com.srnyapathi.di;

import com.srnyapathi.di.services.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DependencyinjectionApplication {
    @Autowired
    CoffeeService coffeeService;

    public static void main(String[] args) {
        SpringApplication.run(DependencyinjectionApplication.class, args);
    }

    @PostConstruct
    void printCoffee() {
        System.out.println("Coffee Service " + coffeeService.getCoffee());
    }

}
