package com.wozu.api.Controllers;

import com.wozu.api.Models.Movie;
import com.wozu.api.Services.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    MovieServiceImpl movieServiceImpl;

    @GetMapping("/movie/{search}")
    @ResponseBody
    public Movie getMovie(@RequestParam String search) {
        return movieServiceImpl.getMovie(search);
    }

}
