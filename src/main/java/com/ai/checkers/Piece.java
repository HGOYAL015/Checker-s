/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ai.checkers;

import java.util.ArrayList;

/**
 *
 * @author goyal
 */
public class Piece {

    int row;
    int column;
    int team;
    int king = 0;
    int up = 0;
    int down = 1;
    moves Position;
    ArrayList<moves> Move;
    ArrayList<moves> Kill;

    public Piece(int team, int row, int column) {
        up = team;
        down = (1 - team);
        this.row = row;
        this.column = column;
        Position = new moves();
        Position.x = row;
        Position.y = column;
    }

    public Piece(Piece temp) {
        up = temp.up;
        down = temp.down;
        king = temp.king;
        this.row = temp.row;
        this.column = temp.column;
        Position = new moves();
        Position.x = temp.Position.x;
        Position.y = temp.Position.y;

    }

    public static class moves {

        int x, y;

        public moves() {

        }

        public moves(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
