package com.primakara.banking;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel mainPanelLogin;
    private JPanel panelJudul;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panelTombol;
    private JButton Login;
    private JLabel labelJudul;

    JFrame frame = new JFrame("Core Banking System");

    public Login() {
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Home homepage = new Home();
                homepage.createPage();
            }
        });
    }

    public void createPage() {
        frame.setContentPane(new Login().mainPanelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,170);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
