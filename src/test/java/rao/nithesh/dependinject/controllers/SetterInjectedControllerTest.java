package rao.nithesh.dependinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rao.nithesh.dependinject.services.GreetingServiceConstructor;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceConstructor());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}