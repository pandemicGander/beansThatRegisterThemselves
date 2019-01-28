package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver{

    @Autowired
    private BuilderFactory builderFactory;


    void run(){
        System.out.println(builderFactory.getBuilder("myKey").doLogic());
        System.out.println(builderFactory.getBuilder("anotherKey").doLogic());
    }

}
