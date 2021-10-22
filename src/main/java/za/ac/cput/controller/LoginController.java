package za.ac.cput.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController
{
    @GetMapping( "/login")
    @ResponseBody
    public String login()
    {
        return "success";
    }
}
