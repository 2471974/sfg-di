package rao.nithesh.dependinject.services;

public class GreetingServicePrimaryGerman implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServicePrimaryGerman(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}