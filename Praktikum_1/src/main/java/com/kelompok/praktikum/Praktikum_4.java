/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok.praktikum;
import java.util.Scanner;

/**
 *
 * @author Athaya Nabil Putra Halby
 */
public class Praktikum_4 {

    public static void main(String[] args) {
        //If Else if Else
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();
        if (nilai > 75){
            System.out.println("Anda lulus Ujian");
        }
        else if(nilai > 65){
            System.out.println("Nilai anda berada di ambang batas kelulusan");
        } 
        else{
            System.out.println("Anda harus mengulang ujian");
        }
        //Switch case
        System.out.print("Masukkan warna (RGB): ");
        String warna = input.next();
        switch (warna){
            case "R":
                System.out.println("Anda memilih warna merah");
                break;
            case "G":
                System.out.println("Anda memilih warna hijau");
                break;
            case "B":
                System.out.println("Anda memilih warna biru");
                break;
            default:
                System.out.println("Warna tidak tersedia");
        
        }
        //Nested If
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka > 0){
            System.out.println("Bilangan bernilai positif");
            if (angka %2 == 0){
                System.out.print("dan genap");
            } else{
                System.out.print("dan ganjil");
            }
        }else if(angka == 0){
            System.out.printf("Bilangan bernilai netral");
        }else {
            System.out.printf("Bilangan bernilai negatif");
            
            if (angka %2 == 0){
                System.out.print("dan genap");
            } else{
                System.out.print("dan ganjil");
            }
        }
        System.out.println();
        //For loop
        int a;
        for (a=1 ;a <= 5; a++){
            System.out.println("For loop ke-" + a);
        }
        //While loop
        int b = 1;
        while (b <= 5){
            System.out.println("While loop ke-" + b);
            b++;
        }
        //Do while
        int c = 6;
        do{
            System.out.println("DO While loop ke-" + c);
            c++;
        }while (c<=5);
        //Nested Loop
        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int i = 0; i < 3; i++){
            for (int j = i; j < 5; j++){
                System.out.println(kursi + "" + j + "");
            }
            System.out.println();
            kursi++;
        }
        //Break
        for (int d = 1;d <= 10; d++){
            if (d == 5){
                System.out.println("Break di angka " + d);
                break;
            }
            System.out.println("Angka : " + d);
        }
        //Continue
        for (int e = 1; e <= 10; e++){
            if (e % 2 == 0){
                continue;
            }
            System.out.println("Bilangan ganjil : " + e);
        }
    }
}
