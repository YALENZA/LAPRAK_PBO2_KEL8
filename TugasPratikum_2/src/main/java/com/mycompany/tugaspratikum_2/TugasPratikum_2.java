/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspratikum_2;

/**
 *
 * @author Hana
 */
public class TugasPratikum_2 {

    public static void main(String[] args) {
        
//        Menginisialisasi variabel

        String nama = "Hananiah Nuri Latifah", alamat="Jalan Radio 2";
        long nim = 2407111787L;
        
        final String GOLONGAN_DARAH="O";
       
        int umur = 19;
        byte umurDiperkecil = (byte) umur;
        
        double[] ipSetiapSemester = {3.5, 3.8, 4.0};
        
//        Menampilkan biodata
        
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IP Semester 1 : " + ipSetiapSemester[0]);
        System.out.println("IP Semester 2 : " + ipSetiapSemester[1]);
        System.out.println("IP Semester 3 : " + ipSetiapSemester[2]);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umurDiperkecil);
        System.out.println("Golongan Darah : " + GOLONGAN_DARAH);
        
    }
}
