package com.srnyapathi.di.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeServiceTest {

    @Mock
    CoffeeBeansService coffeeBeansService;

    @Mock
    MilkService milkService;

    @Mock
    SugarService sugarService;

    @InjectMocks
    CoffeeService coffeeService;

    @Test
    void testMock(){
        Mockito.when(coffeeBeansService.getBeans()).thenReturn("African Beans");
        Mockito.when(milkService.getMilk()).thenReturn("Buffalo");
        Mockito.when(sugarService.getSugar()).thenReturn("10 spoons of sugar");
        String coffee = coffeeService.getCoffee();
        assertEquals("Your Coffee is made from African Beansand Buffalo with 10 spoons of sugar",coffee);
    }

}