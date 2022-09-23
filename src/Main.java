import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Medic medic = new Medic();

    Hero[] hero = {magic, warrior,medic};

        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].applySuperAbility());
            System.out.println(medic.increaseExperience());

        }



        }
    }