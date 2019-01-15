package com.chess.pieces;

import com.chess.Coord;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class King implements Piece {

    private int rank; //value for priority
    private String color;
    private Coord coord;
    private ImageIcon img;
    private int id;

    public King(String color, int x, int y, int id) {
        this.id = id;
        this.rank = 4;
        this.color = color;
        this.coord = new Coord(x, y);

        if (color.equals("white")) {
            img = new ImageIcon("img/white_king1.png");
        } else //black
            img = new ImageIcon("img/black_king1.png");
    }

    @Override
    public Coord getPosition() {
        return coord;
    }

    @Override
    public void setPosition(int x, int y) {
        coord.x=x;
        coord.y=y;
    }

    @Override
    public ImageIcon getImg() {
        return img;
    }

    @Override

    public List<List<Coord>> possibleMoves() {
        List<List<Coord>> coords = new ArrayList<>();

        List<Coord> coord1 = new ArrayList<>();
        List<Coord> coord2 = new ArrayList<>();
        List<Coord> coord3 = new ArrayList<>();
        List<Coord> coord4 = new ArrayList<>();
        List<Coord> coord5 = new ArrayList<>();
        List<Coord> coord6 = new ArrayList<>();
        List<Coord> coord7 = new ArrayList<>();
        List<Coord> coord8 = new ArrayList<>();

        if(coord.x<7)
            coord1.add(new Coord(coord.x+1,coord.y));
        if(coord.x>0)
            coord2.add(new Coord(coord.x-1,coord.y));
        if(coord.y<7)
            coord3.add(new Coord(coord.x,coord.y+1));
        if(coord.y>0)
            coord4.add(new Coord(coord.x,coord.y-1));
        if(coord.x<7 && coord.y<7)
            coord5.add(new Coord(coord.x+1, coord.y+1));
        if(coord.x<7 && coord.y>0)
            coord6.add(new Coord(coord.x+1, coord.y-1));
        if(coord.x>0 && coord.y<7)
            coord7.add(new Coord(coord.x-1, coord.y+1));
        if(coord.x>0 && coord.y>0)
            coord8.add(new Coord(coord.x-1, coord.y-1));


        coords.add(coord1);
        coords.add( coord2);
        coords.add( coord3);
        coords.add( coord4);
        coords.add(coord5);
        coords.add( coord6);
        coords.add( coord7);
        coords.add( coord8);

        return coords;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getRank() {
        return rank;
    }
}
