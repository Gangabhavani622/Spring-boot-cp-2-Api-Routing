package com.example.apirouting;
/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    MyService service = new MyService();

    @GetMapping("/")
    public String getHomePage() {
        return service.getHomePage();
    }

    @GetMapping("/about")
    public String getAboutPage() {
        return service.getAboutPage();
    }

}