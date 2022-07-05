package main;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleBean {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle bmw = new Vehicle();
        bmw.setName("bmw");
        Supplier<Vehicle> bmwSupplier = () -> bmw;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random "+randomNumber);

        if(randomNumber%2==0){
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }else{
            context.registerBean("bmw", Vehicle.class, bmwSupplier);
        }

        Vehicle audiVehicle = null;
        Vehicle bmwVehicle = null;

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while create audi vehicle");
        }

        try {
            bmwVehicle = context.getBean("bmw", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while create bmw vehicle");
        }

        if(bmwVehicle!=null){
            System.out.println("Programing vehicle name from Spring Context is: " + bmwVehicle.getName());
        }else if(audiVehicle!=null){
            System.out.println("Programing vehicle name from Spring Context is: " + audiVehicle.getName());
        }
    }
}
