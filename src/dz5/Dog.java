package dz5;

class Dog extends Animal {
    private static int dogCount;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " бегает " + distance + " м");
        } else {
            System.out.println(name + " слижком для него");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " плавает " + distance + " м");
        } else {
            System.out.println(name + " слижком для него");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
