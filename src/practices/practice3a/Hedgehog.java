package practices.practice3a;

class Hedgehog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
    }

    public void makeSound(String sound) {
        super.makeSound(sound);
    }

    public Hedgehog() {
        super();
        System.out.println("ya rodilsya");
    }
}
