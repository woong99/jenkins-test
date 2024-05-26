package potatowoong.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    public String healthCheck() {
        return "I'm healthy!";
    }
}
