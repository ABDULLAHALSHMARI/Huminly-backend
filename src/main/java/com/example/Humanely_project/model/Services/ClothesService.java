package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.Clothes;
import com.example.Humanely_project.model.Repositories.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClothesService {
    private ClothesRepository clothesRepository;
    @Autowired
    public ClothesService(ClothesRepository clothesRepository){this.clothesRepository = clothesRepository;}

    public List<Clothes> getClothes() {
        return clothesRepository.findAll();
    }
    public Optional<Clothes> getClothes(Integer clothesId ){
        return clothesRepository.findById(clothesId);
    }
    public void addNewClothes(Clothes clothes){
        clothesRepository.save(clothes);
    }

    public void deleteUsers(Integer clothesId) {
        clothesRepository.deleteById(clothesId);
    }


}
