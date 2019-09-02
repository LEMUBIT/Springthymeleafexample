package lemubit.academy.springthymeleafexample.controller;

import lemubit.academy.springthymeleafexample.model.Cars;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("test")
    public String testingDemo(Model model) {
        model.addAttribute("title", "I love my God");
        model.addAttribute("carBrand", "Toyota");
        model.addAttribute("price", 200);

        List<Cars> carsList= new ArrayList<>();
        carsList.add(new Cars("1000","Toyota","2009"));
        carsList.add(new Cars("1400","BMW","2019"));
        carsList.add(new Cars("3000","Benz","2020"));

        model.addAttribute("cars",carsList);


        return "home";
    }


    @RequestMapping("scope")
    public String demo3(HttpServletRequest request, Model model) {
        // Request
        request.setAttribute("request", "request data");
        // Session
        request.getSession().setAttribute("session", "session data");
        // Application
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "scope";
    }
}
