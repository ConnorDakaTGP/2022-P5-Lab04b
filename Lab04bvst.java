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

        //Main Circle
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

        //Outer ring

        //Triangle

        //Inner ring


        //A
        g.fillRect(25,475,25,125);
        g.fillRect(75,475,25,125);
        g.fillRect(50,475,25,25);
        g.fillRect(50,525,25,25);
        //P
        g.fillRect(125,475,25,125);
        g.fillRect(175,475,25,75);
        g.fillRect(150,525,25,25);
        g.fillRect(150,475,25,25);
        //C
        g.fillRect(225,475,25,125);
        g.fillRect(250,475,50,25);
        g.fillRect(250,575,50,25);
        //S
        g.fillRect(325,475,75,25);
        g.fillRect(325,525,75,25);
        g.fillRect(325,575,75,25);
        g.fillRect(325,500,25,25);
        g.fillRect(375,550,25,25);

        //pacmen flower
        g.fillArc(600,375,75,75,-225,270);
        g.fillArc(550,425,75,75,-135,270);
        g.fillArc(600,475,75,75,-45,270);
        g.fillArc(650,425,75,75,45,270);

    }

}


