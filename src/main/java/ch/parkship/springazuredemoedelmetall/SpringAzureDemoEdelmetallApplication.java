package ch.parkship.springazuredemoedelmetall;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class SpringAzureDemoEdelmetallApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringAzureDemoEdelmetallApplication.class);
    }

    public static void main(String[] args) {
        ApplicationInsights.attach();
        SpringApplication.run(SpringAzureDemoEdelmetallApplication.class, args);
    }

}
