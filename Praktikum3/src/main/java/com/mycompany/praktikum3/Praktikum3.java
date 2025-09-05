/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.praktikum3;

import java.util.Scanner;

/**
 *
 * @author Anggi
 */
public class Praktikum3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Panjang balok : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan Lebar balok   : ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan Tinggi balok  : ");
        int tinggi = scanner.nextInt();

        int volume = panjang * lebar * tinggi;

        System.out.printf("Volume dari Balok adalah %d cm", volume);
    }
}