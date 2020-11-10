package com.wozu.api.Repositories;

import com.wozu.api.Models.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepo extends CrudRepository<Dog, Long> {}
