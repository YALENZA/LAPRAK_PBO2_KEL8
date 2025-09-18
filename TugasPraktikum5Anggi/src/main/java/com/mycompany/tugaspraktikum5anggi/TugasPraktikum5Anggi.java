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
         
        Pesanan O1 = new Pesanan ("Nasi Goreng");
        Pesanan O2 = new Pesanan ("Mie Aceh", 3);
        Pesanan O3 = new Pesanan ("Bakso", 2, 20000 );
        
        
        
        O1.tampilkanInfo();
        O2.tampilkanInfo();
        O3.tampilkanInfo();
        System.out.println("Total pesanan pertama setelah di diskon : Rp " + O1.hargaPesanan(0.1));
        System.out.println("Total pesanan kedua setelah di diskon   : Rp " + O2.hargaPesanan(0.1));
        System.out.println("Total pesanan ketiga setelah di diskon  : Rp " + O3.hargaPesanan(0.1));
    }
}
