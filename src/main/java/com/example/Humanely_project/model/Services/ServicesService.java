package com.example.Humanely_project.model.Services;

import com.example.Humanely_project.model.Entities.Services;
import com.example.Humanely_project.model.Repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesService {
    private ServiceRepository serviceRepository ;
@Autowired
    public ServicesService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }



    public List <Services> getServices(){ return serviceRepository.findAll();}
    public Optional<Services> getServices(Integer servicesId ) {
        return serviceRepository.findById(servicesId);
    }
    public void addNewServices(Services services){
    serviceRepository.save(services);
    }
            public void deleteServices(Integer servicesId) {
                serviceRepository.deleteById(servicesId);
            }
        }