package com.example.Humanely_project.model.Services;



import com.example.Humanely_project.model.Entities.ElectricDev;
import com.example.Humanely_project.model.Repositories.ElectricDevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectricDevService {
    private ElectricDevRepository electricDevRepository;
    @Autowired
    public ElectricDevService(ElectricDevRepository electricDevRepository){this.electricDevRepository = electricDevRepository;}


public List<ElectricDev> getElectricDev() {
    return electricDevRepository.findAll();
}
    public Optional<ElectricDev> getElectricDev(Integer electricDevId ){
        return electricDevRepository.findById(electricDevId);
    }
    public void addNewElectricDev(ElectricDev electricDev){
        electricDevRepository.save(electricDev);
    }

    public void deleteUsers(Integer electricDevId) {
        electricDevRepository.deleteById(electricDevId);
    }

}
