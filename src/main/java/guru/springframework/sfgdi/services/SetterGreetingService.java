package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Hasan on 14/10/2020
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {

        return "Hello World - Setter";
    }
}
