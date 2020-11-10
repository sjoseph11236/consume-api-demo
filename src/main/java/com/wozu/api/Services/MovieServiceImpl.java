package com.wozu.api.Services;

import com.wozu.api.Models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService {

    @Value("${api_key}")
    private String api_key;

    @Override
    public Movie getMovie(String search) {
        String url = "http://omdbapi.com/?apikey=" + api_key + "&t=" + search + "&plot=full";
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject(url, Movie.class);
    }
}
