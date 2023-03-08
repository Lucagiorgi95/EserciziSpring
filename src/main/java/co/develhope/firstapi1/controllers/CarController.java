package co.develhope.firstapi1.controllers;

import co.develhope.firstapi1.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

/**
 * Esercizio 05 Spring
 * Chiedere al tutor chiarimenti sulla validazione
 */
@RestController
public class CarController {

    CarDTO carDTO;

    //Creazione di carDTO con stampa in console e messaggio di successo
    @PostMapping("/new-car")
    public String newcar(@RequestParam String id, @RequestParam String modelcar, @RequestParam double prize){
        carDTO = new CarDTO(id,modelcar, prize);
        System.out.printf("Model car: %s, ID: %s, Prize: %s", carDTO.getModelName(),carDTO.getId(),carDTO.getPrice());
        return "Successfully";
    }

    //Richiesta che ritorna car
    @GetMapping("/car")
    public CarDTO carDTO(){
        return carDTO;
    }
}
