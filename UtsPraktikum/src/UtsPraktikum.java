import java.util.Scanner;
//Rifqi
public class UtsPraktikum {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            BangunRuang panjang = new BangunRuang();

            System.out.println("Selamat datang di kalkulator menghitung volume dan luas bangun ruang");
            System.out.println("1.Kubus");
            System.out.println("2.Bola");
            System.out.println("3.Limas Segiempat");
            System.out.println("4.Rekap perhitungan");
            System.out.println("5.keluar");
            System.out.print("masukkan pilihan : ");
            pilihan = input.nextInt();

            switch {
                case 1:
                    System.out.print("Masukkan sisi kubus : ");
                    double input = input.nextDouble();
                    System.out.println("Volume kubus : ");
                    System.out.println("Luas kubus : ");

                case 2:
                    System.out.println("Masukkan jari jari bola : ");
                    double input = input.nextDouble();
                    System.out.println("Volume bola : ");
                    System.out.println("Luas bola : ");

                case 3;
                    System.out.println("Masukkan tinggi limas : ");
                    double input = input.nextDouble();
                    System.out.println("Volume limas : ");
                    System.out.println("luas limas : ");

                case 4;
                    System.out.println("");
                case 5;
                    System.out.println("Terimakasih");
            }
        } while (pilihan != 5);
    do {
        System.out.println("Selamat datang di Student App");
        System.out.println("1.Tampilkan Biodata");
        System.out.println("2.Hitung umur akademik");
        System.out.println("3.Keluar");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();

        switch {
            case 1:
            System.out.println("Biodata : ");
            System.out.println("");

            case 2:
                System.out.println("umur akademik");

            case 3:
                System.out.println("Terimakasih");

        }

    }
    while (pilihan != 3);
    }


}
