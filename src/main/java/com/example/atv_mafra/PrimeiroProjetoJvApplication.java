package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
@RequestMapping("/contato")
public class PrimeiroProjetoJvApplication {
    
    @GetMapping
    public String Get() {
        return "GET funcionando!";
    }

    @PostMapping
    public String Post() {
        return "POST funcionando!";
    }

    @PutMapping
    public String Put() {
        return "PUT funcionando!";
    }

    @DeleteMapping
    public String Delete() {
        return "DELETE funcionando!";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrimeiroProjetoJvApplication.class, args);
    }
}