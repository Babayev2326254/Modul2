package Leson111.Dao;

import Leson111.Human;

import java.util.ArrayList;

public class HumanDao {
    private ArrayList<Human> humans = new ArrayList<>();

    public Human getHumanByIndex(int id) {
        return humans.get(id);
    }

    public void addHuman(Human human) {
        humans.add(human);
    }
}
