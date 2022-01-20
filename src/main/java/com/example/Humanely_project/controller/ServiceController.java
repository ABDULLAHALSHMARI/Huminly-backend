package com.example.Humanely_project.controller;

import com.example.Humanely_project.model.Entities.Services;
import com.example.Humanely_project.model.Services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/services")
public class ServiceController {
    private ServicesService servicesService;

    @Autowired

    public ServiceController (ServicesService servicesService){
        this.servicesService = servicesService;}

    @GetMapping
    public List<Services> getServices(){return servicesService.getServices();}

    @PostMapping("add")
    public void registerNewServices(@RequestBody Services services) {
        System.out.println("in add");
        servicesService.addNewServices(services);
    }

        @GetMapping(path = "{servicesId}")
        public Optional<Services> getServices(@PathVariable (name = "servicesId") Integer servicesId) {
            return servicesService.getServices(servicesId);
        }
    }

