//package 매서드;
//
//class Character{
//    String name;
//    int hp;
//    int attackPower;
//    int level;
//
//
//    Character(String name, int hp, int attackPower, int level,){
//
//        this.name = name;
//        this.hp = hp;
//        this.attackPower = attackPower;
//        this.level = level;
//    }
//    Character(String name, int level){
//        this(name, 100 + level * 10, 10 + level * 2, 1);
//    }//요약가능
//    Character(String name){
//        this.name = name;
//    }
//    Character() {
//        // 이게 오버로딩
//    }
//    void takeDamage(int damage) {
//        hp -= damage;
//    }
//    void heal(int amount){
//        hp += amount;
//    }
//    void attack(Character target){
//        target.takeDamage(this.attackPower);
////      target.hp -= this.attackPower;
//    }
//    static int calculatelevel(int exp) {
//        return exp / 100 + 1;
//    }
//}
//
//public class rpg {
//    public static void main(String[] args) {
//        Character ch1 = new Character("윤아");
//        Character ch2 = new Character();
////        ch1.name = "윤아";
////        ch1.hp = 100;
////        ch1.attackPower = 20;
////        ch1.level = 1;
//    }
//}
