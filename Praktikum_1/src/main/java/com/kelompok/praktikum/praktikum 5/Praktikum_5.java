/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;

/**
 *
 * @author VICTUS
 */
public class Praktikum_5 {
    public static void main(String[] args){

        Mobil mobilSaya = new Mobil("Toyota", "Merah", 2007);
        Mobil mobilKedua = new Mobil("Civic", "Hitam", 2007);
        Mobil mobilKetiga = new Mobil();
        
        Calculator kal = new Calculator();
        System.out.println("Hasil pertambahan int 1 + 10 = " + kal.tambah(1, 10));
        System.out.println("Hasil Pertambahan double 2.4 + 3.3 = " + kal.tambah(2.4, 3.3));
        
    }
}
