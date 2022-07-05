package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct // Container hoặc ApplicationContext sẽ gọi hàm này sau khi một Bean được tạo ra và quản lý.
    public void initialize(){
        this.name = "BMW";
    }

    public void printHello(){
        System.out.println("Hello world");
    }
}
