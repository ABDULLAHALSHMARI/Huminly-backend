package com.example.Humanely_project.controller;


import com.example.Humanely_project.model.Entities.ElectricDev;
import com.example.Humanely_project.model.Services.ElectricDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://humanlyhelp.herokuapp.com/")
@RestController
@RequestMapping(path = "api/ElectricDevice")
public class ElectricDevController {
    private ElectricDevService electricDevService;

    @Autowired
    public ElectricDevController(ElectricDevService electricDevService) {
        this.electricDevService = electricDevService;
    }

    public ElectricDevService getElectricDevService() {
        return electricDevService;
    }

    public void setElectricDevService(ElectricDevService electricDevService) {
        this.electricDevService = electricDevService;
    }

    @GetMapping
    public List<ElectricDev> getElectricDev() {
        return electricDevService.getElectricDev();
    }

    @PostMapping("add")
    public void registerNewElectricDev(@RequestBody ElectricDev electricDev) {
        electricDevService.addNewElectricDev(electricDev);
    }

    @GetMapping(path = "{electricDevId}")
    public Optional<ElectricDev> getElectricDev(@PathVariable (name = "ElectricDevId") Integer electricDevId) {
        return electricDevService.getElectricDev (electricDevId);
    }

    @DeleteMapping(path = "delete/{electricDev}")
    public void deleteElectricDev (@PathVariable("electricDev") Integer electricDevId){
        electricDevService.deleteUsers(electricDevId);
    }

}
