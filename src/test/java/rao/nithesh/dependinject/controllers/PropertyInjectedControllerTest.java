package rao.nithesh.dependinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rao.nithesh.dependinject.services.GreetingServiceConstructor;

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