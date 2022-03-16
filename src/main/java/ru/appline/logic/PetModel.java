package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PetModel implements Serializable {
    private static final PetModel instance = new PetModel();

    private final Map<Integer, Pet> model;

    //конструктор, который будет инициализировать мапу
    public PetModel() {
        model = new HashMap<Integer, Pet>();
    }

    //метод, с помощью которого мы будем получать инстансы
    public static PetModel getInstance() {
        return instance;
    }

    //метод, добавляющий питомцев в мапу
    public void add(Pet pet, int id) {
        model.put(id, pet);
    }

    //метод, позволяющий по ID получать питомца
    public Pet getFromList(int id) {
        return model.get(id);
    }

    //метод, позволяющий получить весь список питомцев
    public Map<Integer, Pet> getAll() {
        return model;
    }

    //метод, удаляющий питомца из мапы по ID
    public void delete(int id) {
        model.remove(id);
    }
}
