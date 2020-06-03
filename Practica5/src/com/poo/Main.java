package com.poo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("MAIN");
        Canvas mi_canvas = new Canvas();
        JFrame marco = new JFrame("Canvas");
        marco.getContentPane().add(mi_canvas);
        marco.setSize(1024,800);
        marco.setVisible(true);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
