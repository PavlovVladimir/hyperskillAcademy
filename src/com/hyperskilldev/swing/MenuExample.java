package com.hyperskilldev.swing;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MenuExample extends JFrame {

    public MenuExample() {
        super("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenu newMenuItem = new JMenu("New");
        JMenuItem textFileMenuItem = new JMenuItem("Text File");
        JMenuItem imgFileMenuItem = new JMenuItem("Image File");
        JMenuItem folderMenuItem = new JMenuItem("Folder");
        newMenuItem.add(textFileMenuItem);
        newMenuItem.add(imgFileMenuItem);
        newMenuItem.add(folderMenuItem);

        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem closeMenuItem = new JMenuItem("Close");
        JMenuItem closeAllMenuItem = new JMenuItem("Close All");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(closeMenuItem);
        fileMenu.add(closeAllMenuItem);

        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(event -> System.exit(0));
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}