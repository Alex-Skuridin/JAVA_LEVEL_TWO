package ru.alex.java2.dz4;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ChatWindow implements ActionListener {

    JTextArea myChatTextArea;
    JTextField myChatTextField;

    public ChatWindow() {
        JFrame chatFrame = new JFrame("Говорилка");
        chatFrame.setLayout(new BorderLayout());
        chatFrame.setBounds(100, 100, 500, 500);
        chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myChatTextArea = new JTextArea();
        myChatTextArea.setPreferredSize(new Dimension(450, 400));
        myChatTextArea.setEditable(false);
        myChatTextField = new JTextField();
        myChatTextField.setActionCommand("myTFSend");
        myChatTextField.addActionListener(this);
        JButton jbtnSendMessage = new JButton("Отправить");
        jbtnSendMessage.addActionListener(this);
        chatFrame.add(new JScrollPane(myChatTextArea), BorderLayout.PAGE_START);
        chatFrame.add(myChatTextField, BorderLayout.CENTER);
        chatFrame.add(jbtnSendMessage, BorderLayout.PAGE_END);
        chatFrame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Отправить")) {
            String jtfStrTemp = myChatTextField.getText();
            myChatTextField.setText("");
            String jtaStrTemp = myChatTextArea.getText();
            jtaStrTemp += ("\n" + jtfStrTemp);
            myChatTextArea.setText(jtaStrTemp);

        } else if (ae.getActionCommand().equals("myTFSend")) {
            String jtfStrTemp = myChatTextField.getText();
            myChatTextField.setText("");
            String jtaStrTemp = myChatTextArea.getText();
            jtaStrTemp += ("\n" + jtfStrTemp);
            myChatTextArea.setText(jtaStrTemp);

        }
    }
}
