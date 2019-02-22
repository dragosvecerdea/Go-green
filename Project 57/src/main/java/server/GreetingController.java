package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/all")
    public Collection<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @RequestMapping("/greet")
    public Greeting greet(@RequestParam(value="name", defaultValue = "Hello") String name,
                          @RequestParam(value="content", defaultValue="trash") String content) {

        if (name.equals("Hello")) {
            return new Greeting(1, name, "you did not change the attribute :(");
        }

        return new Greeting(1, name, content);
    }

    @RequestMapping("/{id}")
    public Greeting getGreetingById(@PathVariable("id") int id) {
        return greetingService.getGreetingById(id);
    }
}
