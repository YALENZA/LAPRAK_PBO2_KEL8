/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspratikum5;

/**
 *
 * @author User
 */
public class TugasPratikum5 {

    public static void main(String[] args) {
        Surat surat1 = new Surat(001, "Undangan", "Soo Ae", "Eunhyuk");
        Surat surat2 = new Surat(002, "Undangan", "Dohwa", "Soo Ae", "12 September 2025");
        Surat surat3 = new Surat();
        
        
        surat1.tampilkanInfo();
        surat2.tampilkanInfo();
        surat3.tampilkanInfo(003);
    }
}
