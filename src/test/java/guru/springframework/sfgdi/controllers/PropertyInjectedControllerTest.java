package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// least preferred method - property injection
class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController = new PropertyInjectedController();

    @Test
    void getGreeting() {
        // can use @BeforeEach to set the instance
        propertyInjectedController.greetingService = new GreetingServiceImpl();
        System.out.println(propertyInjectedController.getGreeting());
    }
}