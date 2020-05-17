package com.hyperskilldev.swing;

import javax.swing.*;

public class fisrtStageOfTextEditor extends JFrame {
    public fisrtStageOfTextEditor() {
        super("The first stage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        initComponents();
        setVisible(true);
        setLayout(null);
    }

    private void initComponents() {
        JTextArea textArea = new JTextArea();
        textArea.setBounds(5, 5, 290, 290);
        textArea.setName("TextArea");
        add(textArea);
    }

    public static void main(final String[] args) {
        new fisrtStageOfTextEditor();
    }
}
