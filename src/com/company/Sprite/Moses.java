package com.company.Sprite;

import com.company.GameView.DisasterView;
import com.company.GameView.RedSeaGameView;
import com.company.GameView.TenCommandmentView;
import com.company.Main;
import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;
import com.company.Sprite.RedSeaViewSprite.Anubis;
import com.company.Sprite.RedSeaViewSprite.Cat;
import com.company.Sprite.RedSeaViewSprite.Pharaoh;
import com.company.Sprite.TenCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class Moses extends Sprite {
    // 初始化 Moses 物件的建構子，設定位置 (x, y)
    public Moses(int x, int y) {
        setPosition(x, y);
        // 載入 Moses 圖片
        img = new ImageIcon("Moses.png");
    }

    // 檢查給定位置 (x, y) 是否有重疊物件的方法
    @Override
    public String overlap(int x, int y) {
        if (Main.gameView instanceof DisasterView) {
            // 檢查青蛙和蟲子
            ArrayList<Frog> frogs = ((DisasterView) Main.gameView).getFrogs();
            ArrayList<Bug> bugs = ((DisasterView) Main.gameView).getBugs();
            for (Frog f : frogs) {
                if (f.getRelativePosition() != null && x == f.getRelativePosition().x && y == f.getRelativePosition().y) {
                    return "Die"; // 如果 Moses 與青蛙重疊，回傳 "Die"
                }
            }
            for (Bug b : bugs) {
                if (b.getRelativePosition() != null && x == b.getRelativePosition().x && y == b.getRelativePosition().y) {
                    return "Die"; // 如果 Moses 與蟲子重疊，回傳 "Die"
                }
            }
            // 檢查冰塊和墓碑
            ArrayList<Ice> ices = ((DisasterView) Main.gameView).getIceCubes();
            ArrayList<Tombstone> tombstones = ((DisasterView) Main.gameView).getStones();
            for (Tombstone t : tombstones) {
                if (t.getRelativePosition() != null && x == t.getRelativePosition().x && y == t.getRelativePosition().y) {
                    return "Cannot move"; // 如果 Moses 與墓碑重疊，回傳 "Cannot move"
                }
            }
            for (Ice i : ices) {
                if (i.getRelativePosition() != null && x == i.getRelativePosition().x && y == i.getRelativePosition().y) {
                    return "Cannot move"; // 如果 Moses 與冰塊重疊，回傳 "Cannot move"
                }
            }
            // 檢查門
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y) {
                return "Next level"; // 如果 Moses 與門重疊，回傳 "Next level"
            }

        } else if (Main.gameView instanceof RedSeaGameView) {
            // 檢查冰塊
            ArrayList<Ice> ices = ((RedSeaGameView) Main.gameView).getIceCubes();
            for (Ice i : ices) {
                if (i.getRelativePosition() != null && x == i.getRelativePosition().x && y == i.getRelativePosition().y) {
                    return "Cannot move"; // 如果 Moses 與冰塊重疊，回傳 "Cannot move"
                }
            }
            // 檢查法老和阿努比斯
            ArrayList<Anubis> anubis = ((RedSeaGameView) Main.gameView).getAnubis();
            ArrayList<Pharaoh> pharaohs = ((RedSeaGameView) Main.gameView).getPharaohs();
            for (Anubis a : anubis) {
                if (a.getRelativePosition() != null && x == a.getRelativePosition().x && y == a.getRelativePosition().y) {
                    return "Die"; // 如果 Moses 與阿努比斯重疊，回傳 "Die"
                }
            }
            for (Pharaoh a : pharaohs) {
                if (a.getRelativePosition() != null && x == a.getRelativePosition().x && y == a.getRelativePosition().y) {
                    return "Die"; // 如果 Moses 與法老重疊，回傳 "Die"
                }
            }
            // 檢查門
            Door door = Main.gameView.getDoor();
            if (x == door.getRelativePosition().x && y == door.getRelativePosition().y) {
                return "Next level"; // 如果 Moses 與門重疊，回傳 "Next level"
            }
        } else if (Main.gameView instanceof TenCommandmentView) {
            // 檢查石頭
            ArrayList<TenCommandment> stones = ((TenCommandmentView) Main.gameView).getStones();
            for (TenCommandment stone : stones) {
                if (stone.getRelativePosition() != null && stone.getRelativePosition().x == x && stone.getRelativePosition().y == y) {
                    stone.setNullPosition();
                    ((TenCommandmentView) Main.gameView).setCount(1);
                    if (((TenCommandmentView) Main.gameView).getCount() == 10) {
                        return "Game over"; // 如果 Moses 收集到 10 塊石頭，回傳 "Game over"
                    } else {
                        return "none"; // 如果 Moses 收集到一塊石頭，回傳 "none"
                    }
                }
            }
        }
        return "none"; // 如果沒有重疊，回傳 "none"
    }
}
