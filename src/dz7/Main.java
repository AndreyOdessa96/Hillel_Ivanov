package dz7;

public class Main {
    public static void main(String[] args) {
        DynamicStringArray array = new DynamicStringArray();

        array.add("Андрей");
        array.add("Иванов");
        array.add(1, "Сергеевич");

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));

        array.delete("Иванов");

        System.out.println(array.get(0));
        System.out.println(array.get(1));
    }
}