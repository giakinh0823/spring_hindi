package services;

import interfaces.Speakers;
import interfaces.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private Speakers speakers;
    private Type type;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = type.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    @Autowired
    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Type getType() {
        return type;
    }

    @Autowired
    public void setType(Type type) {
        this.type = type;
    }
}
