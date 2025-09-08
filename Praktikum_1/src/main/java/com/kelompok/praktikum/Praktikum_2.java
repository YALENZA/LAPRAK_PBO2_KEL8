/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok.praktikum; 

/**
 *
 * @author Athaya Nabil Putra Halby 2407134906
 */
public class Praktikum_2 {

    public static void main(String[] args) {
        //Menampilkan Hello World!
        System.out.println("Hello World!");
        
        /*
           Menampilkan Nama
        */
        System.out.println("Nama Saya Athaya ");
        
        int umur;
        umur = 18;
            String nama = "Athaya Nabil Putra Halby";
            
        System.out.println("Nama saya " + nama);
        System.out.println("Umur " + umur);
            
        int x = 1, y = 3, z = 5;
        System.out.println(x + " " + y + " " + z);
            
        double[] ipSemester = {3.65, 3.54, 4.0, 4.0};
            
        System.out.println( "Ip Semester 4 saya adalah : " + ipSemester[3]);
            
        int intSemester1 = (int) ipSemester[0];
        System.out.println("nilai Ip Semester 1 integer : " + intSemester1);
            
        long nilaiSangatBesar = 3000000000L;
        int intnilaiSangatBesar = (int) nilaiSangatBesar;
            
        System.out.println("Nilai Long sebelum di konversi ke int : " + nilaiSangatBesar);
        System.out.println("Nilai Long setelah dikonversi ke int : " + intnilaiSangatBesar);
            
    }
}