/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum5anggi;

/**
 *
 * @author Anggi
 */
public class Pesanan {
    String namaMakanan;
        int jumlah;
        double harga;
        
        //Conatructor Overloading
        Pesanan (String namaMakanan){
            this.namaMakanan = namaMakanan;
            this.jumlah = 1;
            this. harga = 10000;     
        }
        Pesanan (String namaMakanan, int jumlah) {
            this.namaMakanan = namaMakanan;
            this.jumlah = jumlah;   
            this.harga = 13000;
        }
        Pesanan (String namaMakanan, int jumlah, int harga) {
            this.namaMakanan = namaMakanan;
            this.jumlah = jumlah;
            this.harga = harga;
        }
        
        //Method Overloading 
        double hargaPesanan () {
            return jumlah*harga;
        }
        double hargaPesanan(double diskon) {
            return (jumlah*harga) - ((jumlah*harga)*diskon);
        }
        
        public void tampilkanInfo () {
            System.out.println ("Pesanan Anda : " + namaMakanan);
            System.out.println ("Jumlah pesanan anda : " + jumlah);
            System.out.println ("Total pesanan anda : Rp" + hargaPesanan());
        }
    
}
