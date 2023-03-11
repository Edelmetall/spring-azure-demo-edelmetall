package ch.parkship.springazuredemoedelmetall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoEdelmetallApplication {


    @GetMapping("/message")
    public String message() {
        return "Contrats you app deployd successfully in azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoEdelmetallApplication.class, args);
    }

}
