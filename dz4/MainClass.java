package ru.alex.java2.dz4;
import javax.swing.event.*;
import javax.swing.*;


public class MainClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatWindow();
            }
        });

    }
}
