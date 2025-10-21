public class Karakter {
    private String nama;
    private int nyawa;
    private int baseDamage;
    private int defense;

    public Karakter(String nama, int nyawa, int damage, int defense) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.baseDamage = damage;
        this.defense = defense;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNyawa() {
        return nyawa;
    }
    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }

    public int getDamage() {
        return baseDamage;
    }
    public void setDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }







}
