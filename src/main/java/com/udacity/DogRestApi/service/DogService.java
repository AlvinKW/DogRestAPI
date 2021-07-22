package com.udacity.DogRestApi.service;

import com.udacity.DogRestApi.entity.Dog;

import java.util.List;

// Multiple inheritance
public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
