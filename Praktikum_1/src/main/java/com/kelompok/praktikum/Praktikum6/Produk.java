/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;
import java.util.Scanner;

/**
 *
 * @author Athaya Nabil Putra Halby
 */
public class Produk {
    
    public String nama;
    private int harga;
    protected int stok;
    private final String namaSuppliers = "taya";
    
    static int jumlahProduk = 0;
    
    public Produk(String nama, int harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }
    
    public static void infoJumlahProduk(){
        System.out.println("Total produk yang telah dibuat = " + jumlahProduk);        
    }
    
    private void namaSuppliers(){
        System.out.println("Nama suppliers = " + namaSuppliers);
    }
    
    public void namaSuppliersFix(){
        namaSuppliers();
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int hargaBaru){
        if(hargaBaru > 0){
            this.harga = hargaBaru;
        }
        else if(hargaBaru == 0){
            this.harga = hargaBaru;
            System.out.println("Produk ini gratis");
        }
        else{
           System.out.println("harga tidak boleh negatif");
        }
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama = " + nama);
        System.out.println("Harga = " + harga);
        System.out.println("Stok = " + stok);
    }
    
}
    
