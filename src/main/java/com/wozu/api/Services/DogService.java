package com.wozu.api.Services;

import com.wozu.api.Models.Dog;

public interface DogService {
    public Dog getDog();
    public void saveDog(Dog dog);
}
