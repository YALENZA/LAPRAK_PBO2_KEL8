/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;
import java.util.Scanner;

/**
 
 * @author Athaya Nabil Putra Halby
 */
public class Mobil {
    String Merk;
    String Warna;
    int tahunKeluar;
    
    public Mobil() {
        this.Merk = "Lambo";
        this.Warna = "Biru";
        this.tahunKeluar = 2009;
    }
    
    public Mobil(String Merk, String Warna, int tahunKeluar){
        this.Merk = Merk;
        this.Warna = Warna;
        this.tahunKeluar = tahunKeluar;
    }
    
    public void panaskanMobil(){
        System.out.println("Mobil sedang dipanaskan");
    }

}
