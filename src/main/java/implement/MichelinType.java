package implement;

import interfaces.Type;
import org.springframework.stereotype.Component;

@Component
public class MichelinType implements Type {
    @Override
    public String rotate() {
        return "Vehicle moving with Michelin tyres";
    }
}
