package co.develhope.firstapi1.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


/**
 * Esercizio 04 Spring
 */
@RestController
public class HeaderController {

    @GetMapping(value = "/header")
    public String header(@RequestHeader HttpHeaders headers){
        String host = headers.getHost().getHostName();
        String port = String.valueOf(headers.getHost().getPort());
        return host + " " + port;
    }


}
