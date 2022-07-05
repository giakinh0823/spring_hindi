package main;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleBean {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("Vehicle name from non-spring context is: "+vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicleBean = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring Context is: "+vehicleBean.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: "+ hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: "+num);
    }
}
