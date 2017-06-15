package com.example.mvc.controller;

import com.example.mvc.domain.DeviceService;
import com.example.mvc.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by Hosh on 2017-05-02.
 */
@RestController
@RequestMapping(value = "/device")
public class DeviceController
{

    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService)
    {
        this.deviceService = deviceService;
    }

    @GetMapping("/getall")
    public ResponseEntity getDevices()
    {
        return new ResponseEntity<>(deviceService.getAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/getdisplays", consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity get(@Valid @RequestBody Device device, BindingResult result)
    {
        if (result.hasErrors())
        {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(device, HttpStatus.OK);
    }

}