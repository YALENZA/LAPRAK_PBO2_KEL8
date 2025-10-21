//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KaryawanKontrak kontrak1 = new KaryawanKontrak("Rifqi", "001", 100, 10);
        KaryawanTetap  tetap1 = new KaryawanTetap("Talbi", "002",1000000);

        kontrak1.tampilkanSlipGaji();
        tetap1.tampilkanSlipGaji();
    }
}