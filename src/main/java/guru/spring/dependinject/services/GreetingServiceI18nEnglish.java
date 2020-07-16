package guru.spring.dependinject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service("i18nService")
public class GreetingServiceI18nEnglish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
