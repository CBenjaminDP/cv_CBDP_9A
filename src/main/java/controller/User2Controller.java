package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")
@CrossOrigin(origins = "*")
public class User2Controller {
    @RequestMapping("")
    public String hello() {
        return "Hello World";
    }
}
