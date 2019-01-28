package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AnotherBeanThatRegistersItself extends ExtendMe {

    @Override
    public String getKey() {
        return "anotherKey";
    }

    @Override
    public String doLogic() {
        return "I'm doing another bean custom logic";
    }
}
