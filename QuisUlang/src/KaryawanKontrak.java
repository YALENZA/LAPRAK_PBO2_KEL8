public class KaryawanKontrak extends Karyawan implements DapatGaji{
    private double upahHarian;
    private int jumlahHariMasuk;

    public KaryawanKontrak (String nama, String nip, double upahHarian, int jumlahHariMasuk){
        super(nama, nip);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    public double getUpahHarian() {
        return upahHarian;
    }
    public int  getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }
    public hitungGaji(){
        double gaji;
        gaji = getUpahHarian()*getJumlahHariMasuk();
    }
    @Override
    public void tampilkanSlipGaji() {
        System.out.println("Nama" + getNama());
        System.out.println("NIP : " + getNIP());
        System.out.println("Status karyawan : Karyawan kontrak");
        System.out.println("Gaji : " + gaji());
    }
}
