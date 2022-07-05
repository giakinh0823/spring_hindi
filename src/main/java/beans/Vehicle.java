package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PreDestroy // IoC Container hoặc ApplicationContext sẽ gọi hàm này trước khi một Bean bị xóa hoặc không được quản lý nữa.
    public void destroy(){
        System.out.println("Destroy vehicle bean");
    }

    public void printHello(){
        System.out.println("Hello world");
    }
}
