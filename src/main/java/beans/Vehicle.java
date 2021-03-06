package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.VehicleService;

@Component
public class Vehicle {
    private String name = "Audi";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
