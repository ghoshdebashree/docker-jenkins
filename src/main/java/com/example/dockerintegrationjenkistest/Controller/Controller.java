package com.example.dockerintegrationjenkistest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/message")
    public String getMessage(){
        return "Learing Jenkins with Dockeer Integration";
    }
}
