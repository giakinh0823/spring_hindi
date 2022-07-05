package main;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHindi {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from spring Context is: "+person.getName());
        System.out.println("Vehicle of person name from spring Context is: "+person.getVehicle().getName());
    }
}
