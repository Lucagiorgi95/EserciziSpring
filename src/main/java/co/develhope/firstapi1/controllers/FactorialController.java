package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Esercizio 02 di Spring
 */
@RestController
public class FactorialController {

    @GetMapping(value = "/factorial/{id}")
    public String getFactorial(@PathVariable(required = false, value = "id") String id){
      return "Questo è il tuo id" + id;
    }
}
