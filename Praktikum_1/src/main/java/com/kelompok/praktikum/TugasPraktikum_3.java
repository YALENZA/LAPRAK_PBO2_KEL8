/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok.praktikum;

/**
 *
 * @author Athaya Nabil Putra Halby 2407134906
 */

import java.util.Scanner;

public class TugasPraktikum_3 {
    public static void main (String[] args){
        int P, L, T;
        Scanner input = new Scanner (System.in);
        
        try {
            System.out.print("Masukkan Panjang Balok : " );
            P = input.nextInt();
        
            System.out.print("Masukkan Lebar Balok : " );
            L = input.nextInt();
        
            System.out.print("Masukkan Tinggi Balok : ");
            T = input.nextInt();
        
            int volumeBalok = P*L*T;
                    
            System.out.print("Berikut volume dari Kubus : " + volumeBalok);
            
        }catch (Exception e){
        }

    }        
}
