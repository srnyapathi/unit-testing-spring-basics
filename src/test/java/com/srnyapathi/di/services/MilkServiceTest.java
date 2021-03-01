package com.srnyapathi.di.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MilkServiceTest {
    @Autowired
    MilkService milkService;

    @Test
    void getMilk(){
        String milk= milkService.getMilk();
    }

}