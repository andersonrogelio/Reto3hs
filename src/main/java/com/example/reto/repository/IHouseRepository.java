package com.example.reto.repository;

import com.example.reto.model.HouseModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IHouseRepository {
    Flux<HouseModel> addHouse(HouseModel house);
    Flux<HouseModel> updateHouse(HouseModel house);
    Flux<HouseModel> showAll();
    Mono<HouseModel> showById();
    Mono<Void> eliminar(Integer id);

}
