package com.example.reto.model;

public class HouseModel {
    private String nameHouse;
    private String descriptionHouse;
    private String founderHouse;
    private String animalHouse;
    private String elementHouse;

    public HouseModel(String nameHouse, String descriptionHouse, String founderHouse, String animalHouse, String elementHouse) {
        this.nameHouse = nameHouse;
        this.descriptionHouse = descriptionHouse;
        this.founderHouse = founderHouse;
        this.animalHouse = animalHouse;
        this.elementHouse = elementHouse;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public String getDescriptionHouse() {
        return descriptionHouse;
    }

    public void setDescriptionHouse(String descriptionHouse) {
        this.descriptionHouse = descriptionHouse;
    }

    public String getFounderHouse() {
        return founderHouse;
    }

    public void setFounderHouse(String founderHouse) {
        this.founderHouse = founderHouse;
    }

    public String getAnimalHouse() {
        return animalHouse;
    }

    public void setAnimalHouse(String animalHouse) {
        this.animalHouse = animalHouse;
    }

    public String getElementHouse() {
        return elementHouse;
    }

    public void setElementHouse(String elementHouse) {
        this.elementHouse = elementHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "nameHouse='" + nameHouse + '\'' +
                ", descriptionHouse='" + descriptionHouse + '\'' +
                ", founderHouse='" + founderHouse + '\'' +
                ", animalHouse='" + animalHouse + '\'' +
                ", elementHouse='" + elementHouse + '\'' +
                '}';
    }
}
