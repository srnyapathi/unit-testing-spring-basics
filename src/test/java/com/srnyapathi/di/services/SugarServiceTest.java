package com.srnyapathi.di.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SugarServiceTest {
    @Autowired
    SugarService sugarService;

    @Test
    void testSugar() {
        String s = sugarService.getSugar();
        assertNotNull(s);
    }


}