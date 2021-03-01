package com.srnyapathi.di.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CoffeeBeansServiceTest {
    @Autowired
    CoffeeBeansService coffeeBeansService;
    @Test
    public void testBeans(){
        String s = coffeeBeansService.getBeans();
        assertNotNull(s);
    }
}