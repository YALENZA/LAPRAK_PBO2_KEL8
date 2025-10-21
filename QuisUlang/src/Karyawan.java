public class Karyawan {
    private String nama;
    private String nip;

    public Karyawan(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }


    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNIP(){
        return nip;
    }
    public void setNIP(String NIP){
        this.nip = NIP;
    }

}
