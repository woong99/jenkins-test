package potatowoong.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public String healthCheck() {
        return "I'm healthy!!!!!!!!123131212121111111!!!!!!!!!!!!!";
    }
}
