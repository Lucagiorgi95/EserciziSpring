package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Esercizio 01 di Spring
 */
@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName(){
        return "Luca";
    }

    @PostMapping(value = "/name")
    public String postReversedName(String name){
        StringBuilder strb = new StringBuilder("Luca");
        name = strb.reverse().toString();
        return name;
    }

}
