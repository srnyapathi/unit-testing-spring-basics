package com.srnyapathi.di.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    @Autowired
    private MilkService milkService;
    @Autowired
    private CoffeeBeansService coffeeBeans;
    @Autowired
    private SugarService sugarService;


    public String getCoffee() {
        return "Your Coffee is made from " + coffeeBeans.getBeans() + "and " + milkService.getMilk() + " with " + sugarService.getSugar();
    }
}
