/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ivnxyz
 */
public class Sierpinsky extends Applet implements MouseListener {
    
    Puntos P;
    Boolean corre;
    
    @Override
    public void init() {
        addMouseListener(this);
        corre = false;
    }
    
    @Override
    public void paint(Graphics g) {
        if(corre){
            dibujarSierpinsky(10, 10, 600);
        }
    }
    
    @Override
    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        P = new Puntos(me.getX(),me.getY());
        corre = true;
        
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    private void dibujarSierpinsky(int x, int y, int side) {
        int sub = side / 3;
        P = new Puntos(x, y);
        P.dibuja(this.getGraphics());

        if (sub >= 3) {
            dibujarSierpinsky(x, y, sub);
            dibujarSierpinsky(x + sub, y, sub);
            dibujarSierpinsky(x + 2 * sub, y, sub);
            dibujarSierpinsky(x, y + sub, sub);
            dibujarSierpinsky(x + 2 * sub, y + sub, sub);
            dibujarSierpinsky(x, y + 2 * sub, sub);
            dibujarSierpinsky(x + sub, y + 2 * sub, sub);
            dibujarSierpinsky(x + 2 * sub, y + 2 * sub, sub);
        }
    }
}
