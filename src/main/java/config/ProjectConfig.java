package config;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="bmw")
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Primary
    @Bean(value="audi")
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("AUDI");
        return vehicle;
    }
    @Bean("vin")
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
