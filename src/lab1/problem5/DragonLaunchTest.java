package lab1.problem5;

public class DragonLaunchTest {
    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));

        System.out.println("Will the dragon eat? " + dragonLaunch.willDragonEatOrNot());
    }
}