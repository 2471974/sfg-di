package guru.spring.dependinject.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en":
                return new GreetingServicePrimary(greetingRepository);
            case "de":
                return new GreetingServicePrimaryGerman(greetingRepository);
            case "es":
                return new GreetingServicePrimarySpanish(greetingRepository);
            default:
                return new GreetingServicePrimary(greetingRepository);
        }
    }
}
