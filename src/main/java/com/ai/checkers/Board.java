/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ai.checkers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.ai.checkers.Piece.moves;

/**
 *
 * @author goyal
 */
public class Board {

    ArrayList<Piece> Team1; // team = 0 , move down
    ArrayList<Piece> Team2; // team = 1 , move up
    public int Occupied[][];

    public Board() {

        Occupied = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Occupied[i][j] = 0;
            }
        }
//           Creating Team1
        Team1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int row = i;
            int column = i % 2;
            for (int a = 0; a < 4; a++, column += 2) {
                Piece temp = new Piece(0, row, column);
                Team1.add(temp);
                Occupied[row][column] = 1;

            }
        }

//        Creating Team2
        Team2 = new ArrayList<>();
        for (int i = 7; i > 4; i--) {
            int row = i;
            int column = i % 2;
            for (int a = 0; a < 4; a++, column += 2) {
                Piece temp = new Piece(1, row, column);
                Team2.add(temp);
                Occupied[row][column] = 2;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(Occupied[i][j]);
            }
            System.out.println();
        }
        System.out.println(Team2.size());

//        Team1.forEach(a -> {
//            System.out.print(a.row + " " + a.column + "\t");
//        });
////        System.out.println();
//        Team2.forEach(a -> {
//            System.out.print(a.row + " " + a.column + "\t");
//        });
    }

    public Board(Board temp) {
        this.Occupied = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.Occupied[i][j] = temp.Occupied[i][j];
            }
        }
        this.Team1 = new ArrayList<>();
        for (Piece a : temp.Team1) {
            this.Team1.add(new Piece(a));
        }
        this.Team2 = new ArrayList<>();
        for (Piece a : temp.Team2) {
            this.Team2.add(new Piece(a));
        }

    }

}
