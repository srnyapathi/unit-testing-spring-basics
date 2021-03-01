package com.srnyapathi.di.services;

import org.springframework.stereotype.Service;

@Service
public class CoffeeBeansService {
    public String getBeans() {
        return "Coorg coffee beans";
    }
}
