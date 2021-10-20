package za.ac.cput.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(
            HttpServletRequest request,
            String username,
            String password
    ) {
        System.out.println(request.getRequestedSessionId());
        request.getSession();
        System.out.println(request.getAttribute("session"));
        System.out.println(request.getRequestedSessionId());

        try {
            request.login(username, password);
            System.out.println(request.getRemoteUser());
            System.out.println(request.getRequestedSessionId());
            return username;
        } catch (ServletException e) {
            return "";
        }
    }

    @GetMapping(value="/get-user")
    @ResponseBody
    public String getUser(HttpServletRequest request)
    {
        System.out.println(request.getRequestedSessionId());
        return request.getRemoteUser();
    }
}
