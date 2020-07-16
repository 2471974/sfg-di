package guru.spring.dependinject.services;

//@Primary
//@Service
public class GreetingServicePrimary implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServicePrimary(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        //return "Hello World from Spring";
        return greetingRepository.getEnglishGreeting();
    }
}
