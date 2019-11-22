/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.awt.Graphics;

/**
 *
 * @author ivnxyz
 */
public class Puntos {
    int x,y;
    
    public Puntos(int px,int py){
        x = px;
        y = py;
    }
    
    public void nuevo(Puntos P){
        x = (x + P.x)/3;
        y = (y + P.y)/3;
    }

    public void dibuja(Graphics g) {
        for (int i=0;i<6;i++){
            g.fillOval(x,y,i,i);
        }
    }
}
