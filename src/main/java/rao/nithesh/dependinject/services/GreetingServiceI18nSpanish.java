package rao.nithesh.dependinject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"es", "default"}) //SET AS DEFAULT PROFILE IF NOT SPECIFIED IN APPLICATION.PROPERTIES
@Service("i18nService")
public class GreetingServiceI18nSpanish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Ola World";
    }
}
