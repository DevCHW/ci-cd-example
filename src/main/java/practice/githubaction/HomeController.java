package practice.githubaction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.version:1.0.0}")
    private String version;

    @GetMapping("/")
    public String home() {
        return "Hello Github Action! version: " + version;
    }
}
