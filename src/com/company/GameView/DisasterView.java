package com.company.GameView;

import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;
import com.company.Sprite.Door;

import javax.swing.*;
import java.util.ArrayList;

public class DisasterView extends GameView {

    public ArrayList<Bug> getBugs() {
        return bugs;
    }

    public ArrayList<Frog> getFrogs() {
        return frogs;
    }

    public ArrayList<Ice> getIceCubes() {
        return iceCubes;
    }

    public ArrayList<Tombstone> getStones() {
        return stones;
    }

    private ArrayList<Bug> bugs = new ArrayList<>();
    private ArrayList<Frog> frogs = new ArrayList<>();
    private ArrayList<Ice> iceCubes = new ArrayList<>();
    private ArrayList<Tombstone> stones = new ArrayList<>();

    public DisasterView(){
        img = new ImageIcon("egypt.jpg");
        elements = new ArrayList<>();
        door = new Door(10, 10);


        bugs.add(new Bug(5, 1));
        bugs.add(new Bug(2, 8));
        bugs.add(new Bug(4, 7));
        bugs.add(new Bug(5, 8));
        bugs.add(new Bug(6, 7));
        bugs.add(new Bug(10, 8));
        frogs.add(new Frog(2, 4));
        frogs.add(new Frog(3, 4));
        frogs.add(new Frog(2, 3));
        frogs.add(new Frog(3, 3));
        frogs.add(new Frog(6, 3));
        frogs.add(new Frog(6, 5));
        frogs.add(new Frog(1, 3));
        frogs.add(new Frog(1, 5));
        frogs.add(new Frog(1, 6));
        frogs.add(new Frog(2, 4));
        iceCubes.add(new Ice(1, 2));
        iceCubes.add(new Ice(2, 2));
        iceCubes.add(new Ice(3, 2));
        iceCubes.add(new Ice(4, 2));
        iceCubes.add(new Ice(5, 2));
        iceCubes.add(new Ice(6, 2));
        iceCubes.add(new Ice(7, 2));
        iceCubes.add(new Ice(8, 2));
        iceCubes.add(new Ice(9, 2));
        iceCubes.add(new Ice(1, 7));
        iceCubes.add(new Ice(1, 8));
        iceCubes.add(new Ice(1, 9));
        iceCubes.add(new Ice(1, 10));
        iceCubes.add(new Ice(10, 5));
        iceCubes.add(new Ice(9, 5));
        iceCubes.add(new Ice(7, 5));
        iceCubes.add(new Ice(3, 5));
        iceCubes.add(new Ice(5, 5));
        iceCubes.add(new Ice(4, 5));
        iceCubes.add(new Ice(8, 5));
        stones.add(new Tombstone(6, 6));
        stones.add(new Tombstone(7, 8));
        stones.add(new Tombstone(8, 8));
        stones.add(new Tombstone(9, 8));
        stones.add(new Tombstone(3, 8));
        stones.add(new Tombstone(7, 9));
        stones.add(new Tombstone(7, 10));

        elements.add(door);
        elements.addAll(stones);
        elements.addAll(iceCubes);
        elements.addAll(frogs);
        elements.addAll(bugs);
    }
}
