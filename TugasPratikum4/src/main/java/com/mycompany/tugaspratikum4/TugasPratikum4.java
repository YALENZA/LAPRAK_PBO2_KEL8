/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspratikum4;

import java.util.Scanner;
/**
 *
 * @author Hana
 */
public class TugasPratikum4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println();
            System.out.println("Selamat datang di Kalkulator Sederhana");
            System.out.println("Pada Kalkulator Sederhana ini Anda dapat menghitung luas : ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
        
            
            System.out.print("Pilihlah bangun datar yang ingin di hitung luasnya : ");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("Menghitung luas persegi");
                    System.out.print("Masukkan sisi persegi : ");
                    Double sp = input.nextDouble();
                    System.out.printf("Luas persegi adalah %.1f cm ^ 2" , (sp * sp));
                    break;
                    
                case 2:
                    System.out.println("Menghitung luas persegi panjang");
                    System.out.print("Masukkan panjang persegi : ");
                    Double pp = input.nextDouble();
                    System.out.print("Masukkan luas persegi : ");
                    Double lp = input.nextDouble();
                    System.out.printf("Luas Persegi adalah %.1f cm ^ 2 " , (pp * lp));
                    break;
                    
                case 3:
                    System.out.println("Menghitung luas lingkaran");
                    System.out.print("Masukkan jari jari lingkaran : ");
                    Double jari = input.nextDouble();
                    System.out.printf("Luas lingkaran adalah %.1f cm ^ 2" , (3.14 * jari * jari));
                    break;
                    
                case 4:
                    System.out.println("Menghitung luas segitiga");
                    System.out.print("Masukkan alas segitiga : ");
                    Double as = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga : ");
                    Double ts = input.nextDouble();
                    System.out.printf("Luas segitiga adalah %.1f cm ^ 2" , ((as * ts)));
                    break;   
                    
                case 5:
                    System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana kelompok 8");
                    break;  
                
                default:
                    System.out.println("Pilihan tidak tersedia, coba lagi");
            }
        } while (pilihan !=5);
        
        
    }
}
