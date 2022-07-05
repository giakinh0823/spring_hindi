package beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Audi";

    public Vehicle(){
        System.out.println("Vehicle bean created by Spring");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
