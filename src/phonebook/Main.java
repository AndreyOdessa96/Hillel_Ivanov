package phonebook;


import java.util.List;

public class Main {
    public static void main(String[] args) {


        Phonebook phonebook = new Phonebook();
        phonebook.add(new Entry("Oleg", "546416"));
        phonebook.add(new Entry("Andrey", "7169473"));
        phonebook.add(new Entry("Irina", "257468"));

        Entry entry = phonebook.find("Oleg");
        System.out.println(entry.getName() + ": " + entry.getPhone());

        List<Entry> entries = phonebook.findAll("Oleg");
        for (Entry e : entries) {
            System.out.println(e.getName() + ": " + e.getPhone());
        }
    }
}