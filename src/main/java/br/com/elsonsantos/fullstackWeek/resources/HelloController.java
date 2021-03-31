package br.com.elsonsantos.fullstackWeek.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloMessage(){
        return " <b><h2>Welcome to Evaccine Plataform</h2></b>";
    }
}
