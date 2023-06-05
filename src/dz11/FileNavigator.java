package dz11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    private Map<String, List<FileData>> filesByPath;

    public FileNavigator() {
        filesByPath = new HashMap<>();
    }

    public void add(FileData fileData) {
        String path = fileData.getPath();
        if (!path.equals(fileData.getPath())) {
            System.out.println("путь FileData не соответствует ключевому пути");
            return;
        }
        if (!filesByPath.containsKey(path)) {
            filesByPath.put(path, new ArrayList<>());
        }
        filesByPath.get(path).add(fileData);
    }

    public List<FileData> find(String path) {
        if (filesByPath.containsKey(path)) {
            return filesByPath.get(path);
        } else {
            return new ArrayList<>();
        }
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> files : filesByPath.values()) {
            for (FileData file : files) {
                if (file.getSize() <= maxSize) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    public void remove(String path) {
        filesByPath.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> files : filesByPath.values()) {
            result.addAll(files);
        }
        result.sort(new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                return Long.compare(o1.getSize(), o2.getSize());
            }
        });
        return result;
    }
}