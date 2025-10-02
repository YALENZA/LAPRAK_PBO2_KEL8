/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum6;

/**
 *
 * @author Rifqi
 */
public class Produk {
    public String nama;
    private int harga;
    protected int stok;
    private final String namaSuplier = "Rifqi";
    
    //konstruktor
    public Produk(String nama, int harga, int stok){
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
            jumlahProduk++;
    }
    //static variabel
    static int jumlahProduk = 0;
    public static void infoJumlah(){
        System.out.println("Total produk yang dibuat adalah : "+jumlahProduk++);
    }
    
    private void namaSuplier(){
        System.out.println("Nama Suplier : " + namaSuplier);
    }
    
    public void namaSupplierFix (){
        namaSuplier();
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setharga(int hargaBaru){
        if(hargaBaru>0){
            this.harga = hargaBaru;
        }
        else if (hargaBaru == 0){
            this.harga=hargaBaru;
            System.out.println("Produk ini gratis.");
        }
        else {
            System.out.println("Harga produk tidak boleh negatif");
        }
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama : " +nama);
        System.out.println("Harga : " +harga);
        System.out.println("Stok : " +stok);
    }
}
