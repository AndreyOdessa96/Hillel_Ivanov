package dz8;

public class Main {
    public static void main(String[] args) {
        Collection collection = new DynamicArray();

        collection.add("one");
        collection.add("two");
        collection.add("three");

        System.out.println(collection.get(0)); // "one"
        System.out.println(collection.get(1)); // "two"
        System.out.println(collection.get(2)); // "three"

        collection.add(1, "four");

        System.out.println(collection.get(0)); // "one"
        System.out.println(collection.get(1)); // "four"
        System.out.println(collection.get(2)); // "two"
        System.out.println(collection.get(3)); // "three"

        collection.delete("two");

        System.out.println(collection.get(0)); // "one"
        System.out.println(collection.get(1)); // "four"
        System.out.println(collection.get(2)); // "three"

        System.out.println(collection.contain("one"));   // true
        System.out.println(collection.contain("two"));   // false
        System.out.println(collection.contain("three")); // true
        System.out.println(collection.contain("four"));  // true

        Collection otherCollection = new DynamicArray();
        otherCollection.add("one");
        otherCollection.add("four");
        otherCollection.add("three");

        System.out.println(collection.equals(otherCollection)); // true

        collection.clear();

        System.out.println(collection.size()); // 0
    }
}
