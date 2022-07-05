package main;

import beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHindi {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring Context is: "+vehicle.getName());
    }
}
