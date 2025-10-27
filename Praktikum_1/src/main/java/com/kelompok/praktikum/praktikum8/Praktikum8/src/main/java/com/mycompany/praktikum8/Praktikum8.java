/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum8;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Praktikum8 {

    public static void main(String[] args) {
        //Memanggil JFrame
        JFrame frame = new JFrame ("Contoh JFrame");
        
        //Mengatur ukuran / size
        frame.setSize (400, 300);
        
        //Mengatur operasi saat window ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Membuat frame terlihat
        
        
        //Opsional : Menempatkan frame di tengah layar
        frame.setLocationRelativeTo (null);
        
        JLabel label = new JLabel ("Contoh Label", SwingConstants.CENTER);
        
        frame.add(label);
        
        JTextField textField = new JTextField (20);
        frame.add(textField);
        
        JButton button = new JButton ("new JButton");
        frame.add(button);
        
        
        
        frame.setVisible (true);
    }
}
