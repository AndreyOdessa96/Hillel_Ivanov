package dz11;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();
        navigator.add(new FileData("file1.txt", 100, "/path/to/file"));
        navigator.add(new FileData("file3.txt", 250, "/path/to/file"));
        navigator.add(new FileData("file2.txt", 200, "/path/to/another/file"));

        List<FileData> files = navigator.find("/path/to/file");
        for (FileData file : files) {
            System.out.println(file.getName());
        }

        files = navigator.filterBySize(250);
        for (FileData file : files) {
            System.out.println(file.getName());
        }

        navigator.remove("/path/to/file");

        files = navigator.sortBySize();
        for (FileData file : files) {
            System.out.println(file.getName());
        }
    }
}