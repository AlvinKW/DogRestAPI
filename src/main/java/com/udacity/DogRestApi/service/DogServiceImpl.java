package com.udacity.DogRestApi.service;

import com.udacity.DogRestApi.entity.Dog;
import com.udacity.DogRestApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    // Auto wire from DogRepository
    @Autowired
    DogRepository dogRepository;


    // Return list from DogRepository queries on database
    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        // import Optional to try to get the resulting Dog object
        // if Dog does not exist, throw DogNotFoundException from interface
        Optional<String> optionalBreed = Optional.ofNullable((dogRepository.findBreedById(id)));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    @Override
    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
