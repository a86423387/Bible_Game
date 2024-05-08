package com.company.Sprite;

import javax.swing.*;

public class Door extends Sprite{

    public Door(int x, int y){
        setPosition(x, y);
        img = new ImageIcon("Door.png");
    }

    @Override
    public String overlap(int x, int i) {
        return null;
    }
}
