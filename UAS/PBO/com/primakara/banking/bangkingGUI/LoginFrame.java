package com.primakara.banking.bangkingGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel Utama
        JPanel panelUtama = new JPanel(new BorderLayout());
        panelUtama.setBorder(new EmptyBorder(20, 20, 20, 20)); // Padding atas, kiri, bawah, kanan

        // Panel Input
        JPanel panelInput = new JPanel(new GridLayout(3, 2, 10, 10)); // Grid dengan 3 baris, 2 kolom
        JLabel labelUsername = new JLabel("Username");
        JLabel labelPassword = new JLabel("Password");
        JTextField fieldUsername = new JTextField();
        JPasswordField fieldPassword = new JPasswordField();
        JButton btnLogin = new JButton("Login");

        // Tambahkan komponen ke Panel Input
        panelInput.add(labelUsername);
        panelInput.add(fieldUsername);
        panelInput.add(labelPassword);
        panelInput.add(fieldPassword);
        panelInput.add(new JLabel()); // Spacer kosong supaya btn loginnnya di kanan
        panelInput.add(btnLogin);

        // Tambahkan panel input ke panel utama
        panelUtama.add(panelInput, BorderLayout.CENTER);

        // Tambahkan panel utama ke JFrame
        add(panelUtama);
        setVisible(true);

        // Listener untuk tombol login
        btnLogin.addActionListener(e -> {
            String username = fieldUsername.getText();
            String password = new String(fieldPassword.getPassword());

            // Contoh validasi login sederhana
            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Berhasil!");
                dispose(); // Tutup Login Frame
                // Pindahkan ke frame berikutnya
             new   MainMenuFrame();
                // new MainMenuFrame(); // Uncomment jika ada MainMenuFrame
            } else {
                JOptionPane.showMessageDialog(this, "Username atau Password salah!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
