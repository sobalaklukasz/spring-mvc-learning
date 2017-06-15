package com.example.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.stream.Collectors;

/**
 * Created by Hosh on 2017-05-28.
 */
@RestController
public class EndpointController
{
    private final RequestMappingHandlerMapping requestMappingHandlerMapping;

    public EndpointController(RequestMappingHandlerMapping requestMappingHandlerMapping)
    {
        this.requestMappingHandlerMapping = requestMappingHandlerMapping;
    }

    @GetMapping(value = "/endpoints")
    public ResponseEntity getEndPoints() {
        return new ResponseEntity<>(requestMappingHandlerMapping.getHandlerMethods().keySet().stream().
                map(e -> e.getPatternsCondition().getPatterns()).
                collect(Collectors.toList()),
                HttpStatus.OK);
    }
}