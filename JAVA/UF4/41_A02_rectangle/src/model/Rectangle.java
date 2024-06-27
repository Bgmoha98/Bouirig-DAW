/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Punt;

/**
 *
 * @author mohab
 */
public class Rectangle {

    private Punt p1;
    private Punt p2;
    private Punt p3;
    private Punt p4;

    public Rectangle(Punt p1, Punt p3) {
        this.p1 = p1;
        this.p3 = p3;
        p2 = new Punt(p3.getX(), p1.getY());
        p4 = new Punt(p1.getX(), p3.getY());

    }

    public Rectangle(int base, int altura) {
        this.p1 = new Punt();
        this.p2 = new Punt(base, 0);
        this.p3 = new Punt(base, altura);
        this.p4 = new Punt(0, altura);
    }

    public int getSuperficie() {
        int base = p2.getX() - p1.getX();
        int altura = p4.getY() - p1.getY();
        return base * altura;
    }

    public void moverRectangulo(int numHoritzontal, int numVertical) {

        p1.setX(p1.getX() + numHoritzontal);
        p1.setY(p1.getY() + numVertical);
        
        p2.setX(p2.getX() + numHoritzontal);
        p2.setY(p2.getY() + numVertical);
        
        p3.setX(p3.getX() + numHoritzontal);
        p3.setY(p3.getY() + numVertical);
        
        p4.setX(p4.getX() + numHoritzontal);
        p4.setY(p4.getY() + numVertical);
    }
    
    public Punt getPunt1() {
        return p1;
    }
    
    public Punt getPunt2() {
        return p2;
    }
    
    public Punt getPunt3() {
        return p3;
    }
    
    public Punt getPunt4() {
        return p4;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + '}';
    }

   
}
