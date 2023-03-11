package ch.parkship.springazuredemoedelmetall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {


    @GetMapping("/message")
    public String message() {
        return "Contrats you app deployd successfully in azure";
    }

}
