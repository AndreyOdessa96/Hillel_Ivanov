package dz5;

public class Maine {
        public static void main(String[] args) {
            Dog dogBobik = new Dog("Бобик");
            dogBobik.run(150);
            dogBobik.swim(5);

            Cat catMurzik = new Cat("Мурзик");
            catMurzik.run(100);
            catMurzik.swim(5);

            System.out.println("Animals created: " + Animal.getAnimalCount());
            System.out.println("Dogs created: " + Dog.getDogCount());
            System.out.println("Cats created: " + Cat.getCatCount());
        }
    }

