/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quis1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Quis1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //soal 1
        String nama = "Muhammad Rifqi Fathurrahman";
        int umur = 20;
        System.out.println("Nama saya : " + nama);
        System.out.println("umur saya : " + umur);
        
        //soal 8
        System.out.print("Minggu 1 : " );
        Double kas1 = scanner.nextDouble();
        System.out.print("Minggu 2 : ");
        Double kas2 = scanner.nextDouble();
        System.out.print("Minggu 3 : ");
        Double kas3 = scanner.nextDouble();
        System.out.print("Minggu 4 : ");
        Double kas4 = scanner.nextDouble();
        
        Double total = kas1 + kas2 + kas3 +kas4;
        System.out.println("total uang kas adalah : " + total);
        
        //soal 2
        int bayar = 50000;
        Double setelahDiskon = bayar * 0.1;
        System.out.println("Total belanja RP." + bayar);
        System.out.println("Total belanja seteah diskon 10%" + setelahDiskon);
        
        //soal 4
        System.out.println("Masukkan nama anda : ");
        String murid = scanner.nextLine();
        System.out.println("Halo, " + murid + "selamat belajar java");
        
        
        
        //soal 5
        System.out.print("Berat badan : " );
        Double beratBadan = scanner.nextDouble();
        System.out.print("TInggi Badan : " );
        Double tinggiBadan = scanner.nextDouble();
        
        Double bmi = beratBadan/(tinggiBadan * beratBadan);
        System.out.println("Total BMI anda adalah : " + bmi);
        
        //soal 7
        System.out.print("sisi persegi " );
        Double sisiPersegi = scanner.nextDouble();
        System.out.print("jari jari : " );
        Double jariJari = scanner.nextDouble();
        System.out.print("alas : " );
        Double alas = scanner.nextDouble();
        System.out.print("tinggi : " );
        Double tinggi = scanner.nextDouble();
        
        Double luasPersegi = sisiPersegi * sisiPersegi;
        Double luasLingkaran = 3.14 * jariJari *jariJari;
        Double luasSegitiga = (alas*tinggi)/2;
        
        System.out.println("1.Luas persegi adalah : "  + luasPersegi);
        System.out.println("2.Luas Lingkaran adalah : "  + luasLingkaran);
        System.out.println("3.Luas segitiga adalah : "  + luasSegitiga);
        
        //soal 6
        enum warna{
            MERAH, HIJAU, BIRU
        }
       
        }
    
    
        }

        
        
    
    
    

    
