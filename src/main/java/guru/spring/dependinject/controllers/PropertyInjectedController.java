package guru.spring.dependinject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.spring.dependinject.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceProperty")
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
