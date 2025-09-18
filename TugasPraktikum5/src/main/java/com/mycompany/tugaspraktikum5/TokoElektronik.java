/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum5;

/**
 *
 * @author Rifqi
 */
public class TokoElektronik {
    String namaProduk;
    String merek;
    double harga;
    
    public TokoElektronik() {
        this.namaProduk = "Tidak Dikenal";
        this.merek = "Tidak Dikenal";
        this.harga = 0.0;
    }
    
    public TokoElektronik(String namaProduk, String merek) {
        this.namaProduk = namaProduk;
        this.merek = merek;
        this.harga = 0.0;
    }
    
    public TokoElektronik(String namaProduk, String merek, double harga) {
        this.namaProduk = namaProduk;
        this.merek = merek;
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + this.namaProduk);
        System.out.println("Merek: " + this.merek);
        System.out.println("Harga: Rp" + this.harga);
    }
    
    public void tampilkanInfo(boolean adaDiskon) {
        tampilkanInfo();
        if (adaDiskon) {
            System.out.println("Produk ini sedang dalam promo diskon!");
        } else {
            System.out.println("Produk ini tidak sedang diskon.");
        }
    }
}

