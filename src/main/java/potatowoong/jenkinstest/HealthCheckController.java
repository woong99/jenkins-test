package potatowoong.jenkinstest;

import org.springframework.stereotype.Controller;

@Controller
public class HealthCheckController {
    public String healthCheck() {
        return "I'm healthy!";
    }
}
