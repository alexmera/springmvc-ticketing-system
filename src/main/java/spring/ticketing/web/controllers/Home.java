package spring.ticketing.web.controllers;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Home {

  @GetMapping
  public String home(Model model, Principal principal) {
    model.addAttribute("principalName", principal.getName());
    return "home";
  }
}
