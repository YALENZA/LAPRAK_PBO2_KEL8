public class KaryawanTetap extends Karyawan implements DapatGaji{
    private double gajiBulanan;

    public KaryawanTetap(String nama, String nip, double gajiBulanan) {
        super(nama, nip);
        this.gajiBulanan = gajiBulanan;
    }

    public double getGajiBulanan() {
        return gajiBulanan;
    }

    @Override
    public void tampilkanSlipGaji() {
        System.out.println("Nama" + getNama());
        System.out.println("NIP : " + getNIP());
        System.out.println("Status karyawan : tetap");
        System.out.println("Gaji : " + getGajiBulanan());
    }


}
