/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspraktikum5anggi;

/**
 *
 * @author Anggi
 */
public class TugasPraktikum5Anggi {

    public static void main(String[] args) {
         
        Pesanan pesananPertama = new Pesanan ("Nasi Goreng");
        Pesanan pesananKedua = new Pesanan ("Mie Aceh", 3);
        Pesanan pesananKetiga = new Pesanan ("Bakso", 2, 20000 );
        
        
        
        pesananPertama.tampilkanInfo();
        pesananKedua.tampilkanInfo();
        pesananKetiga.tampilkanInfo();
        System.out.println("Total pesanan pertama setelah di diskon : Rp " + pesananPertama.hargaPesanan(0.1));
        System.out.println("Total pesanan kedua setelah di diskon   : Rp " + pesananKedua.hargaPesanan(0.1));
        System.out.println("Total pesanan ketiga setelah di diskon  : Rp " + pesananKetiga.hargaPesanan(0.1));
    }
}
