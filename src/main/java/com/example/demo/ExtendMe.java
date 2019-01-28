package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ExtendMe implements Builder {

    @Autowired
    private BuilderFactory builderFactory;

    @Override
    public BuilderFactory getBuilderFactory() {
        return builderFactory;
    }
}
