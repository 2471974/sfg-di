package rao.nithesh.dependinject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import rao.nithesh.dependinject.controllers.*;

@SpringBootApplication
@ComponentScan(basePackages = {"rao.nithesh.dependinject"})
public class DependinjectApplication {

    public static void main(String[] args) {
        System.out.println("Process started");

        ApplicationContext ctx = SpringApplication.run(DependinjectApplication.class, args);
        //ABOVE LINE CREATES A SPRING CONTEXT THAT LOADS BEANS FOR ALL CLASSES WITH @Controller NOTATION
        //BEAN NAME WILL BE className FOR CLASS ClassName

        System.out.println("-------------I18--------------");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.getGreeting());

        System.out.println("---------MYCONTROLLER---------");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("-----------PROPERTY-----------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------------SETTER------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------CONSTRUCTA----------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

    }
}
