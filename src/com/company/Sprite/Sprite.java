package com.company.Sprite;
import com.company.GameView.DisasterView;
import com.company.Main;
import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class Sprite {

    protected ImageIcon img;
    protected Point relativePosition;
    protected Point absolutePosition;

    public void draw(Graphics g) {
        if (relativePosition != null) {
            //可以殺死怪物
            img.paintIcon(null, g, absolutePosition.x, absolutePosition.y);
        }
    }

    //relativePosition是可以控制繪製怪物
    //absolutePosition.x控制怪物位置
    public void setPosition(Point p) {
        setPosition(p.x, p.y);
    }

    public void setPosition(int x, int y) {
        relativePosition = new Point(x, y);
        absolutePosition = new Point((x - 1) * Main.CELL, (y - 1) * Main.CELL);
    }

    public void setNullPosition() {
        relativePosition = null;
        absolutePosition = null;
    }

    public Point getRelativePosition() {
        if (relativePosition == null) {
            return null;
        } else {
            return new Point(relativePosition);
        }
    }

    public String overlap(int x, int i) {
        return null;
    }
}
