// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        //Cube Top
        g.drawLine(50,50,200,50);
        g.drawLine(50,50,125,125);
        g.drawLine(200,50,275,125);
        g.drawLine(125,125,275,125);
        //Cube Supports
        g.drawLine(50,50,50,200);
        g.drawLine(200,50,200,200);
        g.drawLine(125,125,125,275);
        g.drawLine(275,125,275,275);
        //Cube Base
        g.drawLine(125,275,275,275);
        g.drawLine(125,125,125,275);
        g.drawLine(275,275,200,200);
        g.drawLine(200,200,50,200);
        g.drawLine(50,200,125,275);

        // DRAW SPHERE
        g.drawOval(400,50,250,250);
        //Longitude
        g.drawOval(500,50,50,250);
        g.drawOval(475,50,100,250);
        g.drawOval(450,50,150,250);
        g.drawOval(425,50,200,250);
        g.drawOval(400,50,250,250);
        //Latitude
        g.drawOval(400,150,250,50);
        g.drawOval(400,125,250,100);
        g.drawOval(400,100,250,150);
        g.drawOval(400,75,250,200);
        g.drawOval(400,50,250,250);

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER



    }

}


