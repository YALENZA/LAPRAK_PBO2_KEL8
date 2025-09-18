/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;

/**
 *
 * @author Athaya Nabil Putra Halby
 */
public class TataSurya {
    String namaPlanet;
    double jumlahRotasi;
    double jumlahRevolusi;
    
    //constructor default
    public TataSurya(){
        this.namaPlanet = "Bumi";
        this.jumlahRotasi = 23.9;
        this.jumlahRevolusi = 365.25;
    }
    
    public TataSurya(String namaPlanet, double jumlahRotasi, double jumlahRevolusi){
        this.namaPlanet = namaPlanet;
        this.jumlahRotasi = jumlahRotasi;
        this.jumlahRevolusi = jumlahRevolusi;
    }
    
    public TataSurya(String namaPlanet){
        this.namaPlanet = namaPlanet;
        this.jumlahRotasi = 24.6;
        this.jumlahRevolusi = 687.0;
    }
    
    public void infoPlanet(){
        System.out.println("Nama Planet = " + this.namaPlanet);
        System.out.println("Jumlah Rotasi = " + this.jumlahRotasi + " Jam");
        System.out.println("Jumlah Revolusi = " + this.jumlahRevolusi + "Hari");
        System.out.println("=================================================");
    }
    
    public void infoPlanet(int totalBulan){
        System.out.println("Nama Planet = " + this.namaPlanet);
        System.out.println("Jumlah Rotasi = " + this.jumlahRotasi + " Jam");
        System.out.println("Jumlah Revolusi = " + this.jumlahRevolusi + " Hari");
        System.out.println("Total Bulan / Satelit Alami = " + totalBulan);
        System.out.println("=================================================");
    }
}
