package com.hyperskilldev.swing;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * package editor;
 *
 * import javax.swing.*;
 * import javax.swing.border.Border;
 * import javax.swing.border.EtchedBorder;
 * import java.awt.*;
 * import java.awt.event.ComponentAdapter;
 * import java.awt.event.ComponentEvent;
 * import java.io.*;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * import java.util.Scanner;
 *
 * public class TextEditor extends JFrame {
 *
 *     private JTextField fileNameInput;
 *     private JScrollPane scrollPane;
 *     private JTextArea textArea;
 *     private JButton saveBtn;
 *     private JButton loadBtn;
 *
 *     public TextEditor() {
 *         initUI();
 *     }
 *     private void initUI() {
 *
 *         this.textArea = new JTextArea();
 *         this.textArea.setName("TextArea");
 *         this.scrollPane = new JScrollPane(this.textArea);
 *         this.textArea.setBorder(BorderFactory
 *                         .createEtchedBorder(EtchedBorder.LOWERED));
 *         setMarginBorder(this.scrollPane, 10, 10, 10, 10);
 *         this.scrollPane.setName("ScrollPane");
 *         this.saveBtn = new JButton("Save");
 *         this.saveBtn.setName("SaveButton");
 *         this.loadBtn = new JButton("Load");
 *         this.loadBtn.setName("LoadButton");
 *         this.fileNameInput = new JTextField();
 *         this.fileNameInput.setName("FilenameField");
 *         JPanel saveLoadPanel = new JPanel();
 *         saveLoadPanel.setSize(300, 60);
 *         this.add(saveLoadPanel, BorderLayout.PAGE_START);
 *         saveLoadPanel.add(this.fileNameInput);
 *         saveLoadPanel.add(this.saveBtn);
 *         saveLoadPanel.add(this.loadBtn);
 *         this.add(this.scrollPane, BorderLayout.CENTER);
 *         forceSize(this.fileNameInput, 130, 27);
 *         this.addComponentListener(new ComponentAdapter() {
 *             @Override
 *             public void componentResized(ComponentEvent e) {
 *                 super.componentResized(e);
 *                 forceSize(fileNameInput,
 *                         calculateWidth(scrollPane, 5,
 *                                 saveBtn.getWidth(), loadBtn.getWidth()), 27);
 *             }
 *         });
 *         this.saveBtn.addActionListener(e -> {
 *             String fileName = fileNameInput.getText();
 *             File file = new File(fileName);
 *             try (PrintWriter writer = new PrintWriter(file)) {
 *                 writer.write(textArea.getText().toCharArray());
 *             } catch (IOException ioException) {
 *                 ioException.printStackTrace();
 *                 System.out.println("Can't save to file!");
 *             }
 *         });
 *         this.loadBtn.addActionListener(e-> {
 *             String fileName = fileNameInput.getText();
 *             try {
 *                 String text = new String(Files.readAllBytes(Paths.get(fileName)));
 *                 textArea.setText(text);
 *             } catch (IOException ioException) {
 *                 ioException.printStackTrace();
 *                 System.out.println("Can't load from file!");
 *                 textArea.setText("");
 *             }
 *         });
 *         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 *         setSize(300, 300);
 *         setVisible(true);
 *         setLocationRelativeTo(null);
 *         setTitle("Text Editor");
 *     }
 *
 *     private void forceSize(JComponent comp, int width, int height) {
 *         Dimension d = new Dimension(width, height);
 *         comp.setMinimumSize(d);
 *         comp.setPreferredSize(d);
 *         comp.setMaximumSize(d);
 *     }
 *     private void setMarginBorder(JComponent comp, int aTop,
 *                                 int aBottom, int aLeft, int aRight) {
 *         Border border = comp.getBorder();
 *         Border marginBorder = BorderFactory.createEmptyBorder(aTop, aLeft, aBottom, aRight);
 *         if (border == null) {
 *             comp.setBorder(marginBorder);
 *         } else {
 *             comp.setBorder(BorderFactory
 *                     .createCompoundBorder(border, marginBorder));
 *         }
 *     }
 *     private int calculateWidth(JComponent field, int gap, int... compWidths) {
 *         int size = field.getWidth();
 *         for (int item : compWidths) {
 *             size -= (item + gap);
 *         }
 *         return size - 22;
 *     }
 *
 * }
 */
public class secondStageOfTextEditor extends JFrame {

    public secondStageOfTextEditor() {
        super("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setName("Panel");
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.GREEN);
        add(panel, BorderLayout.NORTH);

        JTextField filenameField = new JTextField();
        filenameField.setName("FilenameField");
//        filenameField.setMinimumSize(new Dimension(100, 25));
        filenameField.setPreferredSize(new Dimension(150, 25));
//        filenameField.setMaximumSize(new Dimension(300, 25));

        JButton saveButton = new JButton("Save");
        saveButton.setName("SaveButton");

        JButton loadButton = new JButton("Load");
        loadButton.setName("LoadButton");

        panel.add(filenameField);
        panel.add(saveButton);
        panel.add(loadButton);

        JTextArea textArea = new JTextArea();
        textArea.setName("TextArea");

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setName("ScrollPane");
        add(scrollPane, BorderLayout.CENTER);

        loadButton.addActionListener(event -> {
            String path = filenameField.getText();
            if (path != null && path.trim().length() > 0) {
                byte[] bytes = readFile(path);
                if (bytes == null){
                    textArea.setText("");
                } else {
                    textArea.setText(new String(bytes));
                }
            }
        });

        saveButton.addActionListener(event -> {
            String path = filenameField.getText();
            if (path != null && path.trim().length() > 0) {
                saveFile(path, textArea.getText());
            }
        });

    }

    public byte[] readFile(String path) {
        try {
            return Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Cant read file!!!");
            return null;
        }
    }

    public void saveFile(String path, String content) {
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

    public static void main(String[] args) {
        new secondStageOfTextEditor();
    }
}
