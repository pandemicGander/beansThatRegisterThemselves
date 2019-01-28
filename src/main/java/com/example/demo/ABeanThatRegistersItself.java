package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ABeanThatRegistersItself extends ExtendMe {

    @Override
    public String getKey() {
        return "myKey";
    }

    @Override
    public String doLogic() {
        return "I'm doing custom logic";
    }
}
