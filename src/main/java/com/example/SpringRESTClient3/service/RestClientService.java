package com.example.SpringRESTClient3.service;

import com.example.SpringRESTClient3.model.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class RestClientService {

    @Autowired
    private RestTemplate restTemplate;

    //http://localhost:9050/orders/v1/getMovieDetails/100
    public Movie getMovieById(String endpoint) {
        return restTemplate.getForObject(endpoint, Movie.class);

    }


}
