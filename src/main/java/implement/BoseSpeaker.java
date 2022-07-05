package implement;

import interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Play music with bose";
    }
}
