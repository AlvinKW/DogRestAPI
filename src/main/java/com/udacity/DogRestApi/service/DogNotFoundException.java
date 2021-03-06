package com.udacity.DogRestApi.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// return message or reason in code if invalid ID was used
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFoundException  extends RuntimeException {

    public DogNotFoundException() {

    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
