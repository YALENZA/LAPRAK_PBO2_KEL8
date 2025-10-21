import java.util.Random;

public class Mage extends Hero{
    private int magicPower;
    private int mana;

    public Mage(String nama, int nyawa, int baseDamage, int defense, int magicPower, int mana){
        super(nama, nyawa, baseDamage, defense);
        this.magicPower = magicPower;
        this.mana = mana;
    }

    @Override
    public void attackEnemy (Enemy enemy){
        if (mana > 0 ){
            int totalDamage = magicPower;
            enemy.setNyawa(enemy.getNyawa() - totalDamage);
            mana -= 20;
            System.out.println(getNama() + " menyerang " + enemy.getNama() + "Menggunakan magic power");
            System.out.println("Damage: " + totalDamage);
            System.out.println("Nyawa "+ enemy.getNama()+" sekarang: " + enemy.getNyawa());
            System.out.println("Mana tersisa tersisa : " + mana);
        }
        else {
            int totalDamage = totalDamage;
            enemy.setNyawa(enemy.getNyawa() - totalDamage);
            System.out.println(getNama() + " menyerang " + enemy.getNama() );
            System.out.println("Damage: " + totalDamage);
            System.out.println("Nyawa "+ enemy.getNama()+" sekarang: " + enemy.getNyawa());
        }
    }
}
}
