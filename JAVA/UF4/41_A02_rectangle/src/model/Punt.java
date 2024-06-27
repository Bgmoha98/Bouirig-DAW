/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mohab
 */
public class Punt {

    private int x;
    private int y;

    public Punt() {

    } // constructor por defecto

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int num) {
        x = num;
    }

    public void setY(int num) {
        y = num;
    }

    @Override
    public String toString() {
        return " (" +  x + "," + y + ")";
    }

}
