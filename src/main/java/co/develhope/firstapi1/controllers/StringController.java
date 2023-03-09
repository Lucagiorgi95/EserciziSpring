package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Esercizio 03 Spring
 */
@RestController
public class StringController {

    @GetMapping("/concat")
    public String getConcatString(@RequestParam(required = true) String n1, @RequestParam String n2){
        if(n2 == null){
            return n1;
        }
        return n1 + " " + n2;
    }



}
