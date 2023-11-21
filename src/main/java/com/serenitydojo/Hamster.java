package com.serenitydojo;

public class Hamster extends Pet {
    public String name;
    public String favoriteGame;
    public int age;

    public static final String HAMSTER_NOISE = "Squick";

    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }
    @Override
    public String makeNoise() {
        return HAMSTER_NOISE;
    }
    @Override
    public String play() {
        return "runs in wheel";
    }


}
