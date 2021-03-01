package com.srnyapathi.di.services;

import org.springframework.stereotype.Service;

@Service
public class MilkService {
    public String getMilk() {
        return "Cow milk";
    }
}
