package rao.nithesh.dependinject.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class GreetingServicePrimary implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServicePrimary(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        return "Hello World from Spring";
    }
}
