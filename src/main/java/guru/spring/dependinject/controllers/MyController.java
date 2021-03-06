package guru.spring.dependinject.controllers;

import org.springframework.stereotype.Controller;
import guru.spring.dependinject.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        //System.out.println("Hello World");
        return greetingService.sayGreeting();
    }

}
