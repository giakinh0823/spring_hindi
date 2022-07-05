package main;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleBean {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicleBean = context.getBean(Vehicle.class);
        vehicleBean.printHello();
    }
}
