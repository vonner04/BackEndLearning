package dev.vonner.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage(){
        return "Welcome to the world of Spring Boot!";
    }

    @Override
    public String toString() {
        return getWelcomeMessage();
    }
}
