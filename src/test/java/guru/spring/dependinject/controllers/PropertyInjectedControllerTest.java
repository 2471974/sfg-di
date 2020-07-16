package guru.spring.dependinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.spring.dependinject.services.GreetingServiceConstructor;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceConstructor();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}