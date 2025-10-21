import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mage mage = new Mage("Mage", 100, 20, 10, 30, 50);
        Archer archer = new Archer("Archer", 100, 20, 10);
        Warrior warrior = new Warrior("Warrior", 100, 20, 10);
        Enemy goblin = new Enemy("Goblin", 100, 20, 10);
        Enemy orc = new Enemy("Orc", 100, 20, 10);
        Enemy Dragon = new Enemy("Dragon", 1000, 50, 100);

        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Silahkan pilih role");
            System.out.println("1.Mage");
            System.out.println("2.Archer");
            System.out.println("3.Warrior");
            System.out.println("4.keluar");
            System.out.print("Masukkan pilihan anda");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda bermain sebagai mage : " + mage.getNama());
                    System.out.println("anda mendapatkan musuh : " +goblin.getNama() );
                    System.out.println("Anda bisa");
                    System.out.println("1.Menyerang");
                    System.out.println("2.defend");
                    System.out.println("3. use skill");
                    System.out.print("Pilih Aksi : ");
                    int aksi = input.nextInt();

                    switch (aksi){
                        case 1:
                            System.out.println(mage.getNama() + "Menyerang " + goblin.getNama());
                            System.out.println(mage.getNama() + "Menyerang " + archer.getNama());
                            break;
                        case 2:
                            System.out.println(mage.getNama() + "Melakukan defend ");
                            break;
                        case 3:
                            System.out.println(mage.getNama() + "Melakukan defend ");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Anda bermain sebagai Archer : " + archer.getNama());
                    System.out.println("anda mendapatkan musuh : " );
                    System.out.println("Anda bisa");
                    System.out.println("1.Menyerang");
                    System.out.println("2.defend");
                    System.out.println("3. use skill");
                    System.out.print("Pilih Aksi : ");
                    int aksi = input.nextInt();

                    switch (aksi){
                        case 1:
                            System.out.println(archer.getNama() + "Menyerang " + goblin.getNama());
                            System.out.println(archer.getNama() + "Menyerang " + archer.getNama());
                            break;
                        case 2:
                            System.out.println(mage.getNama() + "Melakukan defend ");
                            break;
                        case 3:
                            System.out.println(mage.getNama() + "Melakukan defend ");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Anda bermain sebagai Warrior : " + warrior.getNama());
                    System.out.println("anda mendapatkan musuh : " );
                    System.out.println("Anda bisa");
                    System.out.println("1.Menyerang");
                    System.out.println("2.defend");
                    System.out.println("3. use skill");
                    System.out.print("Pilih Aksi : ");
                    int aksi = input.nextInt();

                    switch (aksi){
                        case 1:
                            System.out.println(mage.getNama() + "Menyerang " + goblin.getNama());
                            System.out.println(mage.getNama() + "Menyerang " + archer.getNama());
                            break;
                        case 2:
                            System.out.println(mage.getNama() + "Melakukan defend ");
                            break;
                        case 3:
                            System.out.println(mage.getNama() + "Melakukan defend ");
                            break;
                    }
                    break;x
            }
        }while(pilihan !=4);
    }
}