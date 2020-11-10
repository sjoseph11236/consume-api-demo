package com.wozu.api.Controllers;

import com.wozu.api.Models.Dog;
import com.wozu.api.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImpl dogServiceimpl;

    @GetMapping("/dog")
    public Dog getDog() {
        return dogServiceimpl.getDog();
    }

    @PostMapping("/create/dog")
    public String createDogFromDogApi() {
        Dog dog = dogServiceimpl.getDog();
        dogServiceimpl.saveDog(dog);
        return "Dog fetched and created in database";
    }


}
