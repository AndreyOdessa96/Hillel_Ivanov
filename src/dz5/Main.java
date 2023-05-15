package dz5;

public class Main {
        public static void main(String[] args) {
            dz5.Dog dogBobik = new dz5.Dog("Бобик");
            dogBobik.run(150);
            dogBobik.swim(5);

            dz5.Cat catMurzik = new dz5.Cat("Мурзик");
            catMurzik.run(100);
            catMurzik.swim(5);

            System.out.println("Animals created: " + dz5.Animal.getAnimalCount());
            System.out.println("Dogs created: " + dz5.Dog.getDogCount());
            System.out.println("Cats created: " + dz5.Cat.getCatCount());
        }
    }

