package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    // interface declare of the GreetingService interface
    @Autowired
    // Autowired: spring tells the DI to inject the instance of GreetingService
    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
