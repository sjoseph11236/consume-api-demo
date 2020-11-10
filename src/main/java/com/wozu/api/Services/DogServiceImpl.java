package com.wozu.api.Services;

import com.wozu.api.Models.Dog;
import com.wozu.api.Repositories.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepo dogRepo;

    public Dog getDog() {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", Dog.class);
    }

    public void saveDog(Dog dog){
        dogRepo.save(dog);
    }
}
