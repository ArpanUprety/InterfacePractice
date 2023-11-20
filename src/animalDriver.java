public class animalDriver {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Animal bird1 = new Bird();

        bird1.makeSound();
        System.out.println(bird1.makeSound());
        System.out.println(dog1.makeSound());

        Dog tank = new Dog();
        System.out.println(tank.misbehave("Homework"));
    }



}
