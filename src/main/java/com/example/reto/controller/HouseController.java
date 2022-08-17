package com.example.reto.controller;

import com.example.reto.model.HouseModel;
import com.example.reto.services.HouseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/HouseOfHogwars")
public class HouseController {
    @Autowired
    private HouseServices repository;

    @GetMapping
    public Flux<HouseModel> show(){
        return repository.showAll();
    }
}
