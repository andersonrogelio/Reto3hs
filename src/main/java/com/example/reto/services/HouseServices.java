package com.example.reto.services;

import com.example.reto.model.HouseModel;
import com.example.reto.repository.IHouseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HouseServices implements IHouseRepository {

    private static final Logger log = LoggerFactory.getLogger(HouseServices.class);
    public List<HouseModel> creationHouse(){
    List<HouseModel> HogwarsHouse = new ArrayList<>();
    HogwarsHouse.add(new HouseModel("Gryffindor","La Casa Gryffindor sólo aceptaba en su casa a aquellos magos y brujas que tenían valentía, disposición, coraje y caballerosidad, ya que éstas son las cualidades de un auténtico Gryffindor.","Godric Gryffindor","León","Fuego"));
    HogwarsHouse.add(new HouseModel("Hufflepuff","La Sala Común de Hufflepuff buscaba alumnos que simplemente quisieran pertenecer a esa casa, aunque actualmente busca alumnos leales, honestos y que no teman el trabajo pesado.","Helga Hufflepuff","Tejón","Tierra"));
    HogwarsHouse.add(new HouseModel("Ravenclaw","La Casa  Ravenclaw busca alumnos creativos, curiosos y que siempre busquen la respuesta.","Rowena Ravenclaw","Águila","Aire"));
    HogwarsHouse.add(new HouseModel("Slytherin","La Casa Slytherin está caracterizada principalmente por la ambición y la astucia.","Salazar Slytherin","Serpiente","Agua"));
    return HogwarsHouse;
    }

    @Override
    public Flux<HouseModel> addHouse(HouseModel house) {
        log.info(house.toString());
        return Flux.just(house);
    }

    @Override
    public Mono<HouseModel> updateHouse(HouseModel house) {
        log.info(house.toString());
        return Mono.just(house);
    }

    @Override
    public Flux<HouseModel> showAll() {
        return Flux.fromIterable(creationHouse());
    }

    @Override
    public Mono<HouseModel> showById() {
        return null;
    }

    @Override
    public Mono<Void> eliminar(Integer id) {
        return null;
    }
}
