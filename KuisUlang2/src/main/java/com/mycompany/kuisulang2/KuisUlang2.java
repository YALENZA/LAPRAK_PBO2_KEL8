/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kuisulang2;

/**
 *
 * @author User
 */
public class KuisUlang2 {

    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap("Dwi", "19016798", 3000000);
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("Aini", "190253", 100000, 10);
        IDGaji[] daftarGaji = {karyawanTetap, karyawanKontrak};

        for (IDGaji k : daftarGaji) {
            k.tampilkanSlipGaji();

        }
    }
}

