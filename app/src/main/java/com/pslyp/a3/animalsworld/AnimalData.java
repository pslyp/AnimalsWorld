package com.pslyp.a3.animalsworld;

import com.pslyp.a3.animalsworld.model.Animal;

import java.util.ArrayList;

/**
 * Created by Promlert on 2017-10-29.
 */

public class AnimalData {

    private static AnimalData sInstance;

    public ArrayList<Animal> animalList;

    public static AnimalData getInstance() {
        if (sInstance == null) {
            sInstance = new AnimalData();
        }
        return sInstance;
    }

}