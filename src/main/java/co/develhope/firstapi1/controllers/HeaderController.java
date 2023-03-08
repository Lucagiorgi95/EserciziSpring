package co.develhope.firstapi1.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

/**
 * Esercizio 04 Spring
 */
@RestController
public class HeaderController {

    @GetMapping(value = "/header")
    public InetSocketAddress header(@RequestHeader HttpHeaders headers){
        return headers.getHost();
    }


}
