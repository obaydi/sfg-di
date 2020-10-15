package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Hasan on 14/10/2020
 */
@Primary
@Service
public class PrimaryGreetingService implements  GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
