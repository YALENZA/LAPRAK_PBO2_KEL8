package com.mycompany.tugaspraktiku2anggi;

public class TugasPraktiku2Anggi {
    public static void main (String[] args){
        //        Menginisialisasi variabel
        String nama = "Anggita Natarina", alamat = "Jalan Teropong";
        long nim = 2407113014L;
        final String GolonganDarah = "-";
        double[] ipSemester = {3.65, 3.54, 4.0};
        int umur = 19;
        byte umurDiperkecil = (byte) umur;
        
        //      Menampilkan Biodata
        System.out.println("Nama saya = " + nama);
        System.out.println("NIM = " + nim);
        System.out.println("IP Semester 1 = " + ipSemester[0]);
        System.out.println("IP Semester 2 = " + ipSemester[1]);
        System.out.println("IP Semester 3 = " + ipSemester[2]);
        System.out.println("Alamat = " + alamat);
        System.out.println("Umur = " + umurDiperkecil);
        System.out.println("Golongan Darah = " + GolonganDarah);

    }
}