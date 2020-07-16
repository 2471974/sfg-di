package rao.nithesh.dependinject.services;

public class GreetingServicePrimarySpanish implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServicePrimarySpanish(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }

}
