package com.lexon.demo;

import java.util.Map;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class HelloController {

    //Get a single user
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return new User(id, "Lexon",  "Role", "Developer");
    }


    //Get All Users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return List.of(
            new User("1", "Lexon", "lol", "Developer")
        );
    }
    

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of("message", "Hello, World!");
    }


    @GetMapping("/time")
    public String getTime() {
        return "Server Time: " + java.time.LocalDateTime.now();
    }


    @GetMapping("/greet")
    public String getGreet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    

    // @PostMapping("/greet")
    // public String greet(@RequestBody Map<String, String> body) {
    //     String name = body.get("name");
    //     return "Hello, " + name + "!";
    // }
    
    
}
