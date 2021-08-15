package za.ac.cput.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping({"/", "/home"})
    String home() {
        return "Welcome to Gym Management Application!";
    }
}
