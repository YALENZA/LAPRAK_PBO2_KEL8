/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kuis1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Kuis1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
       //nomor 1
       String namaPegawai = "Jeon Jungkook";
       String jabatan = "Staff ahli IT";
       
       System.out.println("Nama saya " + namaPegawai);
       System.out.println("Jabatan saya sebagai " + jabatan);
       
       //Soal 2
       double totalBelanja = 120000D;
       double diskon = totalBelanja * 0.15;
       double totalStlhDiskon = totalBelanja - diskon;
       
       System.out.println ("Total belanja anda adalah Rp" + totalBelanja + " diskon 15%, total bayar anda Rp" + totalStlhDiskon );
       
       //Soal 3
       final int MAKSIMAL_SKS = 22;
       final int MINIMUM_SKS = 10;
       
       System.out.println("Maksimal SKS anda adalah " + MAKSIMAL_SKS);
       System.out.println("Minimal SKS anda adalah " + MINIMUM_SKS);
       
       //Soal 4
       System.out.print("Masukkan nama mata kuliah : ");
       String matKul = input.nextLine();
       
       System.out.println ("Selamat datang di kelas " + matKul + "!" );
       
       //Soal 5
       System.out.print("Masukkan berat badan anda : ");
       double beratBadan = input.nextDouble();
       System.out.print("Masukkan tinggi badan anda : ");
       double tinggiBadan = input.nextDouble();
       
       double kalori = (10*beratBadan) + (6.25*tinggiBadan) - 500;
       
       System.out.println("Kalori anda sebanyak " + kalori + "kal");
       
       //Soal 6
       enum BangunDatar {
           PERSEGI, LINGKARAN, SEGITIGA
       }
       BangunDatar bangunDatar1 = BangunDatar.PERSEGI;
       
       if (bangunDatar1 == BangunDatar.PERSEGI);
       System.out.println(bangunDatar1);
       System.out.println(BangunDatar.LINGKARAN);
       System.out.println(BangunDatar.SEGITIGA);
       
       //Soal 7
       int pilihBangunDatar;
       do {
       System.out.println ("Kalkulator menghitung keliling bangun datar");
       System.out.println ("1. Persegi");
       System.out.println ("2. Lingkaran");
       System.out.println ("3. Persegi Panjang");
       System.out.println ("4. Keluar");
       System.out.print ("Masukkan pilihan anda (1234): ");
       pilihBangunDatar = input.nextInt();
       
       
       switch (pilihBangunDatar) {
           case 1 :
               System.out.print ("Masukkan nilai sisi : ");
               int sisi = input.nextInt();
               int keliling1 = 4*sisi;
               System.out.println ("Keliling persegi adalah " + keliling1);
               break;
           case 2 :
               System.out.print ("Masukkan nilai jari-jari : ");
               double jariJari = input.nextDouble();
               final double PHI = 3.14;
               double keliling2 = 2 * PHI * jariJari;
               System.out.println ("Keliling lingkaran adalah " + keliling2);
               break;
           case 3 :
               System.out.print ("Masukkan nilai panjang : ");
               int panjang = input.nextInt();
               System.out.println ("Masukkan nilai lebar : ");
               int lebar = input.nextInt();
               int keliling3 = 2* (panjang * lebar);
               System.out.println ("Keliling persegi panjang  adalah " + keliling3);
               break;
           case 4 :
               System.out.println ("Terimakasih telah menggunakan kalkulator ini!!");
               break;
           default:
               System.out.println ("Inputan anda tidak valid, silahkan input ulang");
           
           }
       } while (pilihBangunDatar != 4);
         
       //Soal 10
       boolean adaYangTidakLulus = false;
       for (int a = 1 ; a <= 7 ; a++) {
           System.out.println ("Masukkan nilai mahasiswa ke-" + a);
           int nilaiMahasiswa = input.nextInt();
           
           if (nilaiMahasiswa <= 70) {
               adaYangTidakLulus = true;
           }
       }
       if (adaYangTidakLulus) {
           System.out.println ("Ada mahasiswa yang tidak Lulus");
       }
       else {
           System.out.println ("Semua mahasiswa Lulus");
       } 
       
       //Soal 11
       class rekening {
           public double saldo;
           
           public rekening (double saldo) {
               this.saldo = saldo;
           }
           public void setor (double setor) {
               this.saldo += setor;
           }
           public void tarik (double jumlah) {
               this.saldo -= jumlah;
           }
       
       public void cekSaldo () {
          System.out.println ("Saldo anda saat ini : " + this.saldo) ;
       }
               
      rekening pertama = new rekening (10000);
      rekening kedua = new rekening (500000);
      
      pertama.cekSaldo();
      
       }
       
}
       
       
    
        
        
    


