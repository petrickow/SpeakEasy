package no.taco.speakeasy;

import no.taco.speakeasy.models.User;
import no.taco.speakeasy.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by catoda on 01.11.2016.
 */

@Controller
class PageController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = {"/", "/home"})
    public String index(Model model)
    {
        model.addAttribute("model", new Index());
        return "index";
    }

    @RequestMapping("/welcome")
    public String greeting(@RequestParam(value="name", defaultValue = "anonymous", required=true) String name, Model model)
    {
        Chat c = new Chat();

        if (repository == null) {

            c.errorMessage = "no repo, no info";
            return "error";
        }

        populateDB();
        c.userName = name;

        model.addAttribute("model", c);

        return "welcome";
    }

    private void populateDB() {
        if (repository.count() == 0) {
            System.out.println("Populate DB");
            repository.save(new User("Sara", "Knu"));
            repository.save(new User("Sara", "Dan"));
            repository.save(new User("Cato", "Dan"));
        } else {
            System.out.println("All swell");
        }
    }
}
