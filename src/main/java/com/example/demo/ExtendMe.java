package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public abstract class ExtendMe implements Builder {

    @Autowired
    private BuilderFactory builderFactory;

    abstract String getKey();

    @PostConstruct
    private void register(){
        System.out.println("Adding to builder factory: "+this);
        builderFactory.addBuilder(getKey(), this);
    }
}
