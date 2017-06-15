package com.example.mvc.controller;

import com.example.mvc.domain.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Hosh on 2017-05-02.
 */
@RestController
@RequestMapping(value = "/display")
public class DisplaysController
{

    private final DisplayService displayService;

    @Autowired
    public DisplaysController(DisplayService displayService)
    {
        this.displayService = displayService;
    }

    @GetMapping("/getall")
    public ResponseEntity getDisplays()
    {
        return new ResponseEntity<>(displayService.getAll(), HttpStatus.OK);
    }

}