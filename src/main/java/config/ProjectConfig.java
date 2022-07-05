package config;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("beans")
public class ProjectConfig {
    @Bean(name = "honda")
    public Vehicle vehicle1(){
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }

    @Bean(name = "bmw")
    public Vehicle vehicle2(){
        var vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean(name = "audi")
    public Vehicle vehicle3(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }
}
