package main;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleBean {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicleBean1 = context.getBean("bmw",Vehicle.class);
        System.out.println("Vehicle name from spring Context is: "+vehicleBean1.getName());
        Vehicle vehicleBean2 = context.getBean("audi",Vehicle.class);
        System.out.println("Vehicle name from spring Context is: "+vehicleBean2.getName());
        Vehicle vehicleBean3 = context.getBean("vin",Vehicle.class);
        System.out.println("Vehicle name from spring Context is: "+vehicleBean3.getName());
    }
}
