package com.hyperskilldev.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fourthStageOfTextEditor extends JFrame {
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuOpen;
    private JMenuItem menuSave;
    private JMenuItem menuExit;
    private JPanel panel;
    private JTextField filenameField;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private JButton saveButton;
    private JButton openButton;

    // Stage 4
    private JButton startSearchButton;
    private JButton previousMatchButton;
    private JButton nextMatchButton;
    private JCheckBox useRegExCheckbox;
    private JFileChooser fileChooser;
    private JMenu menuSearch;
    private JMenuItem menuStartSearch;
    private JMenuItem menuPreviousMatch;
    private JMenuItem menuNextMatch;
    private JMenuItem menuUseRegExp;

    public fourthStageOfTextEditor() {
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

        menuOpen = new JMenuItem("Load");
        menuOpen.setMnemonic(KeyEvent.VK_L);
        menuOpen.setName("MenuLoad");
        menuFile.add(menuOpen);

        menuSave = new JMenuItem("Save");
        menuSave.setMnemonic(KeyEvent.VK_S);
        menuSave.setName("MenuSave");
        menuFile.add(menuSave);

        menuFile.addSeparator();

        menuExit = new JMenuItem("Exit");
        menuExit.setMnemonic(KeyEvent.VK_E);
        menuExit.setName("MenuExit");
        menuFile.add(menuExit);

        menuOpen.addActionListener(event -> loadFile());
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

        openButton = new JButton("Load");
        openButton.setName("OpenButton");

        panel.add(filenameField);
        panel.add(saveButton);
        panel.add(openButton);

        textArea = new JTextArea();
        textArea.setName("TextArea");

        scrollPane = new JScrollPane(textArea);
        scrollPane.setName("ScrollPane");
        add(scrollPane, BorderLayout.CENTER);

        openButton.addActionListener(event -> loadFile());
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
        new fourthStageOfTextEditor();
    }
}
