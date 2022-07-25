package ru.netology.conditionalapplicationjclo11;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.conditionalapplicationjclo11.systemProfile.SystemProfile;

@RestController
@SpringBootApplication
@RequestMapping("/")

public class SpringSecurityApplication {
    private SystemProfile profile;

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }

    @GetMapping("hi")
    public String hi() {
        return "Hi";
    }

    public static void main(String[] args) {
            }
}
