package com.example;

import java.util.Arrays;
import java.util.List;

public class AlexLion extends Lion {

    List<String> friendsList = Arrays.asList("Марти", "Глория", "Мелман");
    String placeOfLiving = "Нью-Йоркский зоопарк";

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return friendsList;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
    
}
