package com.hyperskilldev.swing;

import javax.swing.*;
import java.awt.*;

public class testlayout extends JFrame {
    public testlayout(){
        super("Test layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("Center"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new testlayout();
    }
}
