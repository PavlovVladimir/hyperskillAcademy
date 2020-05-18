package com.hyperskilldev.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class thirdStageOfTextEditor extends JFrame {
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuLoad;
    private JMenuItem menuSave;
    private JMenuItem menuExit;
    private JPanel panel;
    private JTextField filenameField;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private JButton saveButton;
    private JButton loadButton;

    public thirdStageOfTextEditor() {
        super("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        initMenu();
        initUI();
        setVisible(true);
    }

    private void initMenu() {
        this.menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Add File menu
        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFile.setName("MenuFile");
        menuBar.add(menuFile);

        menuLoad = new JMenuItem("Load");
        menuLoad.setMnemonic(KeyEvent.VK_L);
        menuLoad.setName("MenuLoad");
        menuFile.add(menuLoad);

        menuSave = new JMenuItem("Save");
        menuSave.setMnemonic(KeyEvent.VK_S);
        menuSave.setName("MenuSave");
        menuFile.add(menuSave);

        menuFile.addSeparator();

        menuExit = new JMenuItem("Exit");
        menuExit.setMnemonic(KeyEvent.VK_E);
        menuExit.setName("MenuExit");
        menuFile.add(menuExit);

        menuLoad.addActionListener(event -> loadFile());
        menuSave.addActionListener(event -> saveFile());
        menuExit.addActionListener(event -> System.exit(0));
    }

    private void initUI() {
        panel = new JPanel();
        panel.setName("Panel");
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.GREEN);
        add(panel, BorderLayout.NORTH);

        filenameField = new JTextField();
        filenameField.setName("FilenameField");
//        filenameField.setMinimumSize(new Dimension(100, 25));
        filenameField.setPreferredSize(new Dimension(150, 25));
//        filenameField.setMaximumSize(new Dimension(300, 25));

        saveButton = new JButton("Save");
        saveButton.setName("SaveButton");

        loadButton = new JButton("Load");
        loadButton.setName("LoadButton");

        panel.add(filenameField);
        panel.add(saveButton);
        panel.add(loadButton);

        textArea = new JTextArea();
        textArea.setName("TextArea");

        scrollPane = new JScrollPane(textArea);
        scrollPane.setName("ScrollPane");
        add(scrollPane, BorderLayout.CENTER);

        loadButton.addActionListener(event -> loadFile());
        saveButton.addActionListener(event -> saveFile());
    }

    private void loadFile() {
        String path = filenameField.getText();
        if (path != null && path.trim().length() > 0) {
            try {
                byte[] bytes = Files.readAllBytes(Paths.get(path));
                textArea.setText(new String(bytes));
            } catch (IOException e) {
                textArea.setText("");
                System.out.println("Cant read file!!!");
            }
        }
    }

    private void saveFile() {
        String path = filenameField.getText();
        String content = textArea.getText();

        if (path != null && path.trim().length() > 0) {
            Path filePath = Paths.get(path);
            try (
                    final BufferedWriter writer = Files.newBufferedWriter(filePath);
            ) {
                writer.write(content);
                writer.flush();
            } catch (IOException e) {
                System.out.println("Cant save file" + e);
            }
        }
    }

    public static void main(String[] args) {
        new thirdStageOfTextEditor();
    }
}
