package rao.nithesh.dependinject.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructor implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Constructor";
    }
}
