public class Enemy extends Karakter{
    public Enemy (String nama, int nyawa ,int damage, int defense){
        super(nama, nyawa, damage, defense);
    }


    public void attackHero (Hero hero){
        int totalDamage = getDamage();
        hero.setNyawa(hero.getNyawa()- getDamage());
        System.out.println(getNama() + " Menyerang " + hero.getNama());
        System.out.println("damage : " + getDamage());
        System.out.println("Sisa nyawa : " + hero.getNama() + " sekarang : " + hero.getNyawa());
    }

}
