package config;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("AUDI");
        return vehicle;
    }
    @Bean
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("VIN");
        return vehicle;
    }


    @Bean
    public String hello(){
        return "Hello world";
    }

    @Bean
    public Integer number(){
        return 23;
    }
}
