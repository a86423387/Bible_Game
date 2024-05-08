package com.company.GameView;

import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.Door;
import com.company.Sprite.RedSeaViewSprite.Anubis;
import com.company.Sprite.RedSeaViewSprite.Cat;
import com.company.Sprite.RedSeaViewSprite.Pharaoh;

import javax.swing.*;
import java.util.ArrayList;

public class RedSeaGameView extends GameView{

    public ArrayList<Ice> getIceCubes() {
        return iceCubes;
    }

    public ArrayList<Anubis> getAnubis() {
        return anubis;
    }

    public ArrayList<Pharaoh> getPharaohs() {
        return pharaohs;
    }

    private ArrayList<Ice> iceCubes = new ArrayList<>();
    private ArrayList<Anubis> anubis = new ArrayList<>();
    private ArrayList<Pharaoh> pharaohs = new ArrayList<>();

    public RedSeaGameView(){
        img = new ImageIcon("sea.jpg");
        elements = new ArrayList<>();
        door = new Door(10, 10);

        iceCubes.add(new Ice(2, 1));
        iceCubes.add(new Ice(2, 2));
        iceCubes.add(new Ice(2, 3));
        iceCubes.add(new Ice(2, 4));
        iceCubes.add(new Ice(2, 5));
        iceCubes.add(new Ice(2, 7));
        iceCubes.add(new Ice(1, 7));
        iceCubes.add(new Ice(3, 7));
        iceCubes.add(new Ice(4, 7));
        iceCubes.add(new Ice(5, 7));
        iceCubes.add(new Ice(5, 4));
        iceCubes.add(new Ice(5, 5));
        iceCubes.add(new Ice(5, 6));
        iceCubes.add(new Ice(5, 8));
        iceCubes.add(new Ice(5, 9));
        iceCubes.add(new Ice(5, 1));
        iceCubes.add(new Ice(4, 1));
        iceCubes.add(new Ice(6, 1));
        iceCubes.add(new Ice(2, 9));
        iceCubes.add(new Ice(3, 9));
        iceCubes.add(new Ice(4, 9));
        iceCubes.add(new Ice(7, 1));
        iceCubes.add(new Ice(7, 2));
        iceCubes.add(new Ice(7, 3));
        iceCubes.add(new Ice(7, 4));
        iceCubes.add(new Ice(7, 6));
        iceCubes.add(new Ice(7, 7));
        iceCubes.add(new Ice(7, 8));
        iceCubes.add(new Ice(7, 9));
        iceCubes.add(new Ice(7, 10));
        iceCubes.add(new Ice(9, 2));
        iceCubes.add(new Ice(9, 3));
        iceCubes.add(new Ice(9, 4));
        iceCubes.add(new Ice(9, 5));
        iceCubes.add(new Ice(9, 6));
        iceCubes.add(new Ice(9, 7));
        iceCubes.add(new Ice(9, 8));
        iceCubes.add(new Ice(9, 9));

        pharaohs.add(new Pharaoh(3, 3));
        pharaohs.add(new Pharaoh(3, 4));
        pharaohs.add(new Pharaoh(4, 5));
        pharaohs.add(new Pharaoh(7, 5));
        pharaohs.add(new Pharaoh(10, 2));
        pharaohs.add(new Pharaoh(10, 3));
        pharaohs.add(new Pharaoh(10, 4));
        pharaohs.add(new Pharaoh(10, 5));

        anubis.add(new Anubis(6, 6));
        anubis.add(new Anubis(6, 7));
        anubis.add(new Anubis(6, 8));
        anubis.add(new Anubis(6, 9));
        anubis.add(new Anubis(6, 10));
        anubis.add(new Anubis(8, 6));
        anubis.add(new Anubis(8, 7));
        anubis.add(new Anubis(8, 8));
        anubis.add(new Anubis(8, 9));
        anubis.add(new Anubis(8, 10));

        elements.addAll(anubis);
        elements.addAll(pharaohs);
        elements.addAll(iceCubes);
        elements.add(door);
        
    }
}
