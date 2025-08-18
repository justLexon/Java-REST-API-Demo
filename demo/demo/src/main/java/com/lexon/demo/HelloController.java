package com.lexon.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/user")
    public Map<String, String> getUser() {
        return Map.of("name", "Lexon",  "Role", "Developer");
    }
    

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
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
