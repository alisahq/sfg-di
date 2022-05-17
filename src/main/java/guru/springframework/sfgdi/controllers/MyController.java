package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;


// add controller
@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello World!!!");
        return "Hi folks!";
    }
}
