package rao.nithesh.dependinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rao.nithesh.dependinject.services.GreetingServiceConstructor;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceConstructor());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}