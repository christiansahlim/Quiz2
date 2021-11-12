/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author Chris
 */
public class MainMenu implements ActionListener {

    static JFrame frame;
    JPanel panel;
    JButton btnRegister, btnLogin, btnData, btnExit;

    public MainMenu() {
        //Frame
        frame = new JFrame("Main Menu");
        frame.setSize(450, 550);

        //Panel
        panel = new JPanel();
        panel.setSize(450, 550);
        panel.setBackground(new Color(255, 249, 232));
        
        ImageIcon logo = new ImageIcon("src\\source\\panah.jng");
        Image scaleImage = logo.getImage().getScaledInstance(150, 150,Image.SCALE_SMOOTH);

        //Button
        btnRegister = new JButton("Register");
        btnRegister.setBounds(110, 80, 220, 60);
        btnRegister.setFont(new Font("Arial", Font.BOLD, 20));
        btnLogin = new JButton("Login");
        btnLogin.setBounds(110, 200, 220, 60);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 20));
        btnData = new JButton("Lihat Data");
        btnData.setBounds(110, 200, 220, 60);
        btnData.setFont(new Font("Arial", Font.BOLD, 20));
        btnExit = new JButton("Exit");
        btnExit.setBounds(110, 320, 220, 60);
        btnExit.setFont(new Font("Arial", Font.BOLD, 20));

        btnRegister.addActionListener(this);
        btnLogin.addActionListener(this);
        btnExit.addActionListener(this);

        //Add
        panel.add(btnRegister);
        panel.add(btnLogin);
        panel.add(btnData);
        panel.add(btnExit);

        frame.add(panel);

        panel.setLayout(null);
        panel.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "LogIn":
                User user = null;
                new LoginForm();
                break;
            case "Register":
                new RegisterForm();
                break;
            case "Lihat Data":
                new LihatData();
                break;
            case "Exit":
                frame.dispose();
                break;
            default:
                break;
        }
    }
}
