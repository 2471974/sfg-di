package rao.nithesh.dependinject.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceGetter implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Setter";
    }
}
