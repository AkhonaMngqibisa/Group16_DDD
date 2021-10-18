package za.ac.cput.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController
{
    @RequestMapping({"/", "/home"})
    public String home()
    {

        return "home";
    }
    @RequestMapping({"/", "/dashboard"})
    public String dashboard()
    {

        return "dashboard";
    }


    @RequestMapping( "/login")
    public String login()
    {
        return "login";
    }

}
