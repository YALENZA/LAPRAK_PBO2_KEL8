/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspraktikumpbo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class UtsPraktikumPBO {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        
        
        //Soal 1
        System.out.println ("Masukka nama : ");
        String namaMahasiswa = input.nextLine();
       
        System.out.println ("StudentApp");
        System.out.println ("1. Tampilkan Biodata");
        System.out.println ("2.Hitung umur Akademik");
        System.out.println ("3. Keluar");
        int pilihMenu = input.nextInt();
        
        switch (pilihMenu) {
            case 1 : 
                
                System.out.println ("Nama saya anggita natarina");
                System.out.println ("biasanya saya dipanggil anggi");
                System.out.println ("umur saya 19 tahun");
                System.out.println ("hobi saya mendengarkan musik");
                break;
            case 2 :
                
                System.out.println ("Umur akademik sekarang = 2025");
                
            case 3 :
                System.out.println ("terimakasih telah menggunakan StudentApp");
            default :
                System.out.println ("Pilihan tidak valid, silahkan input ulang!");
                
                
            
        }
    } while (!pilihMenu = 3);
       
        
        
        int pilihan; 
        do {
        System.out.println ("Kalkulator menghitung volume dan luas bangun ruang");
        System.out.println ("1. Kubus");
        System.out.println ("2. Bola");
        System.out.println ("3. Limas Segitiga");
        System.out.println ("4. Rekap perhitungan");
        System.out.println ("5. Keluar");
        System.out.print ("Masukkan pilihan anda (12345)");
        pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1 :
                System.out.println ("Masukkan nilai sisi kubus : ");
                double sisi = input.nextDouble();
                double volume1 = sisi*sisi*sisi;
                System.out.println ("Volume kubus adalah " + volume1 );
                double luasPermukaan1 = 6* sisi*sisi;
                System.out.println ("Luas permukaan kubus adalah " + luasPermukaan1);
                break;
            case 2 :
                System.out.println ("Masukkan nilai jari-jari");
                int jariJari = input.nextInt();
                final double PHI = 3.14;
                double volume2 = 4/3 * PHI * jariJari * jariJari *jariJari;
                System.out.println ("Volume Bola adalah " + volume2 );
                double luasPermukaan2 = 4/3*PHI*jariJari*jariJari*jariJari;
                System.out.println ("Luas permukaan Bola adalah " + luasPermukaan2 );
                break;
            case 3 :
                System.out.println ("Masukkan nilai sisi bola :");
                double sisi2 = input.nextDouble ();
                System.out.println ("Masukkan nilai tinggi bola :");
                double tinggi = input.nextDouble ();
                System.out.println ("Masukkan nilai alas bola :");
                double alas = input.nextDouble ();
                double volume3 = 1/3 * sisi2 *sisi2*tinggi;
                System.out.println ("Volume Limas Segiempat adalah " + volume3 );
                double luasPermukaan3 = (sisi2*sisi2) + 4*1/2*alas*tinggi;
                System.out.println ("Luas permukaan Limas Segiempat adalah " + luasPermukaan3 );
                break;
                
            case 4 :
                System.out.println ("Terimakasih telah menggunakan kalkulator ini");
                break;
            default :
                System.out.println ("Pilihan tidak valid, silahkan input ulang!");
                
        }
        
        }  while (!pilihan = 4) ;
    }
}

