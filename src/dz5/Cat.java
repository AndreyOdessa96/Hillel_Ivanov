package dz5;

class Cat extends Animal {
        private static int catCount;
        private String name;

        public Cat(String name) {
            super();
            this.name = name;
            catCount++;
        }

        @Override
        public void run(int distance) {
            if (distance <= 200) {
                System.out.println(name + " бегает " + distance + " м");
            } else {
                System.out.println(name + " слишком для кота");
            }
        }

        @Override
        public void swim(int distance) {
            System.out.println(name + " не плавает");
        }

        public static int getCatCount() {
            return catCount;
        }
    }
