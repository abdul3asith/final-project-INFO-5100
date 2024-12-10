package reference.impact.mobile.Mobile.Impact.Project;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Welcome to My Java Website!");
        return "home"; // Refers to home.html in the templates folder
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // Refers to about.html in the templates folder
    }
}
