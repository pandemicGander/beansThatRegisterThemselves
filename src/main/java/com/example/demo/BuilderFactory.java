package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BuilderFactory {

    private Map<String, Builder> builders = new HashMap<>();

    void addBuilder(String key, Builder value){
        builders.put(key, value);
    }

    public Builder getBuilder(String key){
        return builders.get(key);
    }


}
