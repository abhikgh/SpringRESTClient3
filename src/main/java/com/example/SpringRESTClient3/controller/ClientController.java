package com.example.SpringRESTClient3.controller;

import com.example.SpringRESTClient3.model.Movie;
import com.example.SpringRESTClient3.service.RestClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders/v1")
@Slf4j
public class ClientController {


    @Autowired
    private RestClientService restClientService;


    // http://localhost:7090/orders/v1/getMovieDetails/100
    @GetMapping(value = "/getMovieDetails/{movieId}")
    public Movie getMovieDetails(
            @PathVariable("movieId") Integer movieId) {

        String endpoint = "http://localhost:9050/orders/v1/getMovieDetails/" + movieId;
        return restClientService.getMovieById(endpoint);
    }

}
