package com.example.reto.controller;

import com.example.reto.model.HouseModel;
import com.example.reto.services.HouseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/HouseOfHogwars")
public class HouseController {
    @Autowired
    private HouseServices repository;

    @GetMapping
    public Flux<HouseModel> show(){
        return repository.showAll();
    }
    @GetMapping("/{id}")
    public Mono<HouseModel> findId(@PathVariable Integer id){
        return repository.showById(id);
    }

    @PostMapping("/newHouse")
    public Flux<HouseModel> newHouse(@RequestBody HouseModel house){
        return repository.addHouse(house);
    }
    @PutMapping("/UpdateHouse")
    public Mono<HouseModel> upDateHouse(@RequestBody HouseModel house){
        return repository.updateHouse(house);
    }
    @DeleteMapping("/DeleteHouse/{id}")
    public Mono<Void> deleteHouse(@PathVariable Integer id){
        return repository.removeHouse(id);
    }


}
