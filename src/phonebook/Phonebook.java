package phonebook;


import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Entry> entries;

    public Phonebook() {
        this.entries = new ArrayList<>();
    }

    public void add(Entry entry) {
        this.entries.add(entry);
    }

    public Entry find(String name) {
        for (Entry entry : this.entries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        List<Entry> result = new ArrayList<>();
        for (Entry entry : this.entries) {
            if (entry.getName().equals(name)) {
                result.add(entry);
            }
        }
        return result.isEmpty() ? null : result;
    }
}

class Entry {
    private String name;
    private String phone;

    public Entry(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
