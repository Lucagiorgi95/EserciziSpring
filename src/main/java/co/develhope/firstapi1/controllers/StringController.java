package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * Esercizio 03 Spring
 * Da vedere con il tutor
 */
@RestController
public class StringController {

    @NotBlank(message = "Mandatory")
    private String n1;

    private String n2;

    @GetMapping("/concat")
    public String getConcatString(@Valid @RequestParam String n1, String n2){
        if(n2 == null){
            return n1;
        }
        return n1 + " " + n2;
    }



}
