package com.example.Humanely_project.controller;

import com.example.Humanely_project.model.Entities.Clothes;
import com.example.Humanely_project.model.Services.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping(path = "api/clothes")
    public class ClothesController {
        private ClothesService clothesService;

        @Autowired

        public ClothesController(ClothesService clothesService) {
            this.clothesService = clothesService;
        }

        public ClothesService getClothesService() {
            return clothesService;
        }

        public void setClothesService(ClothesService clothesService) {
            this.clothesService = clothesService;
        }

        @GetMapping
        public List<Clothes> getClothes() {
            return clothesService.getClothes();
        }

        @PostMapping("add")
        public void registerNewClothes(@RequestBody Clothes clothes) {
            clothesService.addNewClothes(clothes);
        }

        @GetMapping(path = "{clothesId}")
        public Optional<Clothes> getClothes(@PathVariable (name = "clothesId") Integer clothesId) {
            return clothesService.getClothes (clothesId);
        }

        @DeleteMapping(path = "delete/{clothesId}")
        public void deleteClothes (@PathVariable("clothesId") Integer clothesId){
            clothesService.deleteUsers(clothesId);
        }

    }
