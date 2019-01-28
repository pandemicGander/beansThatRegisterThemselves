package com.example.demo;

import javax.annotation.PostConstruct;

public interface Builder {

    BuilderFactory getBuilderFactory();
    String getKey();
    String doLogic();

    @PostConstruct
    default void register(){
        System.out.println("Adding to builder factory: "+this);
        getBuilderFactory().addBuilder(getKey(), this);
    }



}
