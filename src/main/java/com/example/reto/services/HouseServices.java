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
    public List<HouseModel> HogwarsHouse = new ArrayList<>();
    public List<HouseModel> creationHouse(List<HouseModel> houses){
        houses.add(new HouseModel(1,"Gryffindor","La Casa Gryffindor sólo aceptaba en su casa a aquellos magos y brujas que tenían valentía, disposición, coraje y caballerosidad, ya que éstas son las cualidades de un auténtico Gryffindor.","Godric Gryffindor","León","Fuego"));
        houses.add(new HouseModel(2,"Hufflepuff","La Sala Común de Hufflepuff buscaba alumnos que simplemente quisieran pertenecer a esa casa, aunque actualmente busca alumnos leales, honestos y que no teman el trabajo pesado.","Helga Hufflepuff","Tejón","Tierra"));
        houses.add(new HouseModel(3,"Ravenclaw","La Casa  Ravenclaw busca alumnos creativos, curiosos y que siempre busquen la respuesta.","Rowena Ravenclaw","Águila","Aire"));
        houses.add(new HouseModel(4,"Slytherin","La Casa Slytherin está caracterizada principalmente por la ambición y la astucia.","Salazar Slytherin","Serpiente","Agua"));
    return houses;
    }
    public List<HouseModel> addHouseNew(HouseModel newHouse ,List<HouseModel> houses){
    houses.add(new HouseModel(newHouse.getIdHouse(), newHouse.getNameHouse(), newHouse.getDescriptionHouse(), newHouse.getFounderHouse(), newHouse.getFounderHouse(), newHouse.getElementHouse()));
    return houses;
    }


    @Override
    public Flux<HouseModel> addHouse(HouseModel house) {
        log.info(house.toString());
        addHouseNew(house,HogwarsHouse);
        return Flux.fromIterable(HogwarsHouse);
    }

    @Override
    public Mono<HouseModel> updateHouse(HouseModel house) {
        log.info(house.toString());
        return Mono.just(house);
    }

    @Override
    public Flux<HouseModel> showAll() {
        HogwarsHouse = HogwarsHouse.isEmpty() ? creationHouse(HogwarsHouse):HogwarsHouse;
        return Flux.fromIterable(HogwarsHouse);
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
