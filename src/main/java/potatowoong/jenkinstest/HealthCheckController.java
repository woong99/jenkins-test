package potatowoong.jenkinstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public String healthCheck() {
        return "I'm healthy!!!!!!!!12313121233123123123123123123121231212121111111!!!!!!!!!!!!!";
    }12123131312
}
