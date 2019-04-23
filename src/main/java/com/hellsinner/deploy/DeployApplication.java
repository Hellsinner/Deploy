package com.hellsinner.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployApplication {

    @GetMapping("/index")
    public String index(){
        return "first";
    }
    public static void main(String[] args) {
        SpringApplication.run(DeployApplication.class, args);
    }

}
