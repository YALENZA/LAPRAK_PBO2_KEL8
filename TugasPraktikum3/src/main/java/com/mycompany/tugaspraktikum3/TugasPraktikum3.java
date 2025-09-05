package com.mycompany.tugaspraktikum3;

import java.util.Scanner;

/**
 *
 * @author Rifqi
 */
public class TugasPraktikum3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang balok : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar balok : ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi balok : ");
        int tinggi = scanner.nextInt();
        
        int volume = panjang * lebar * tinggi;
        
        System.out.printf("Volume dari Balok adalah %d cm", volume);
      
    }
}
