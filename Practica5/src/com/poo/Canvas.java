package com.poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Canvas extends JPanel {
    private int delay;
    private final Timer miTimer;
    private Objeto2D prueba = new Objeto2D("/src/com/poo/estworm.png");
    private int fps = 60;

    public Canvas() {
        super();
        this.delay = 1000/fps;
        this.miTimer = new Timer(this.delay,gameTimer);
        miTimer.start();

        prueba.aceleracion = 2;

    }

    public  void UpdateFrame() {
        this.repaint();
        System.out.println("repintando los frames");
    }

    public ActionListener gameTimer = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            UpdateFrame();
        }
    };

    private void DibujarImagenes(BufferedImage imagen,Vector2D coordenadas, Graphics2D g) {
        AffineTransform tx = AffineTransform.getScaleInstance(1,1);
        BufferedImageOp op = new AffineTransformOp(tx,AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        BufferedImage template = op.filter(imagen,null);

        g.drawImage(imagen,op,(int)coordenadas.x,(int)coordenadas.y);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Vector2D AcelerarenX = new Vector2D(prueba.aceleracion,0);

        if(prueba.GetDisplayImage() !=null) {
            DibujarImagenes(prueba.GetDisplayImage().GetImagen(),prueba.coordenadas,(Graphics2D)g);
            prueba.coordenadas = prueba.coordenadas.Suma(AcelerarenX);
        }

    }

}
