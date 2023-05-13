package dz5;

public class Animal {
    private static int animalCount;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        System.out.println("Бег животного " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println("плавает " + distance + " м");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
